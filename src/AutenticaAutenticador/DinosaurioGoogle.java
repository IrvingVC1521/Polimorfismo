package AutenticaAutenticador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DinosaurioGoogle extends JFrame implements KeyListener {
    private int y = 250;
    private int vy = 0;
    private int score = 0;
    private List<Cactus> cactusList = new ArrayList<>();
    private List<Pajaro> pajaroList = new ArrayList<>();
    private boolean gameOver = false;
    private Image dinoImage;

    public DinosaurioGoogle() {
        setTitle("Juego del Dinosaurio Google");
        setSize(800, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        dinoImage = new ImageIcon("dino.png").getImage(); // Asegúrate de tener una imagen "dino.png" en tu proyecto
        setVisible(true);
        // Inicializar cactus y pájaros
        cactusList.add(new Cactus(800));
        pajaroList.add(new Pajaro(800));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(dinoImage, 100, y, this); // Dibuja el dinosaurio
        // Dibuja los cactus
        for (Cactus cactus : cactusList) {
            cactus.paint(g);
        }
        // Dibuja los pájaros
        for (Pajaro pajaro : pajaroList) {
            pajaro.paint(g);
        }
        if (gameOver) {
            g.drawString("Game Over! Puntuación: " + score, 350, 150);
        } else {
            g.drawString("Puntuación: " + score, 700, 30);
        }
    }

    public void jugar() {
        while (!gameOver) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            y += vy;
            vy += 1;
            if (y >= 250) {
                y = 250;
                vy = 0;
            }
            // Mover y verificar colisiones con cactus
            for (Cactus cactus : cactusList) {
                cactus.mover();
                if (cactus.getX() < -20) {
                    cactusList.remove(cactus);
                    cactusList.add(new Cactus(800));
                    score++;
                }
                if (cactus.getRect().intersects(new Rectangle(100, y, dinoImage.getWidth(this), dinoImage.getHeight(this)))) {
                    gameOver = true;
                }
            }
            // Mover y verificar colisiones con pájaros
            for (Pajaro pajaro : pajaroList) {
                pajaro.mover();
                if (pajaro.getX() < -20) {
                    pajaroList.remove(pajaro);
                    pajaroList.add(new Pajaro(800));
                    score++;
                }
                if (pajaro.getRect().intersects(new Rectangle(100, y, dinoImage.getWidth(this), dinoImage.getHeight(this)))) {
                    gameOver = true;
                }
            }
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && y == 250) {
            vy = -15;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    class Cactus {
        private int x, width, height;

        public Cactus(int x) {
            this.x = x;
            this.width = 20;
            this.height = 40;
        }

        public void paint(Graphics g) {
            g.fillRect(x, 310 - height, width, height);
        }

        public void mover() {
            x -= 10;
        }

        public Rectangle getRect() {
            return new Rectangle(x, 310 - height, width, height);
        }

        public int getX() {
            return x;
        }
    }

    class Pajaro {
        private int x, y, width, height;
        private Image birdImage;

        public Pajaro(int x) {
            this.x = x;
            this.y = new Random().nextInt(100) + 150; // Altura aleatoria para el pájaro
            this.width = 30;
            this.height = 20;
            birdImage = new ImageIcon("bird.png").getImage(); // Asegúrate de tener una imagen "bird.png" en tu proyecto
        }

        public void paint(Graphics g) {
            g.drawImage(birdImage, x, y, (ImageObserver) this);
        }

        public void mover() {
            x -= 15;
        }

        public Rectangle getRect() {
            return new Rectangle(x, y, birdImage.getWidth((ImageObserver) this), birdImage.getHeight((ImageObserver) this));
        }

        public int getX() {
            return x;
        }
    }

    public static void main(String[] args) {
        new DinosaurioGoogle().jugar();

    }
}
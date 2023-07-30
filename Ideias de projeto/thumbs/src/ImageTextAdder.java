import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageTextAdder {
    public static void main(String[] args) {
        try {
            // Defina o caminho da imagem original e a localização da imagem com o texto
            String inputImagePath = "C:/Users/jeanc/Downloads/Entrada/skynews-openai-chatgpt_6090512.jpg";
            String outputImagePath = "C:/Users/jeanc/Downloads/Saída/alterada.jpg";

            // Carregue a imagem original
            File inputFile = new File(inputImagePath);
            BufferedImage inputImage = ImageIO.read(inputFile);

            // Crie uma cópia da imagem para adicionar o texto
            BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);

            // Obtenha o contexto gráfico da imagem
            Graphics2D g2d = outputImage.createGraphics();

            // Desenhe a imagem original no contexto gráfico
            g2d.drawImage(inputImage, 0, 0, null);

            // Propriedades do texto
            String text = "Texto de exemplo";
            int fontSize = 30;
            Color textColor = Color.RED;
            int x = 50; // Posição x do texto
            int y = 50; // Posição y do texto

            // Fonte do texto
            Font font = new Font("Arial", Font.PLAIN, fontSize);
            g2d.setFont(font);

            // Cor do texto
            g2d.setColor(textColor);

            // Desenhe o texto na imagem
            g2d.drawString(text, x, y);

            // Finalize o contexto gráfico
            g2d.dispose();

            // Salve a imagem com o texto em disco
            File outputFile = new File(outputImagePath);
            ImageIO.write(outputImage, "jpg", outputFile);

            System.out.println("Imagem com texto criada com sucesso em: " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Erro ao criar a imagem com texto: " + e.getMessage());
        }
    }
}
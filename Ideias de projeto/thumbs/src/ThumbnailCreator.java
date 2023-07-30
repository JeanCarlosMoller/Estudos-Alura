import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ThumbnailCreator {
    public static void main(String[] args) {
        try {
            // Defina o caminho da imagem original e a localização da miniatura
            String inputImagePath = "C:/Users/jeanc/Downloads/Entrada/skynews-openai-chatgpt_6090512.jpg";
            String outputImagePath = "C:/Users/jeanc/Downloads/Saída/alterada.jpg";

            // Largura e a altura desejadas da miniatura
            int thumbWidth = 200;
            int thumbHeight = 200;

            // Carregue a imagem original
            File inputFile = new File(inputImagePath);
            BufferedImage inputImage = ImageIO.read(inputFile);

            // Crie a miniatura redimensionando a imagem original
            BufferedImage thumbImage = resize(inputImage, thumbWidth, thumbHeight);

            // Salve a miniatura em disco
            File outputFile = new File(outputImagePath);
            ImageIO.write(thumbImage, "jpg", outputFile);

            System.out.println("Miniatura criada com sucesso em: " + outputImagePath);
        } catch (IOException e) {
            System.out.println("Erro ao criar a miniatura: " + e.getMessage());
        }
    }

    private static BufferedImage resize(BufferedImage inputImage, int thumbWidth, int thumbHeight) {
        BufferedImage outputImage = new BufferedImage(thumbWidth, thumbHeight, inputImage.getType());

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, thumbWidth, thumbHeight, null);
        g2d.dispose();

        return outputImage;
    }
}
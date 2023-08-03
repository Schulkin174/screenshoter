import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class screenshoterApp {
    public static void main(String[] args) {
        try {
            // Создаем объект Robot для захвата экрана
            Robot robot = new Robot();

            // Получаем размеры экрана
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            // Захватываем скриншот экрана
            BufferedImage screenshot = robot.createScreenCapture(screenRect);

            // Путь и имя файла для сохранения скриншота
            String filePath = "D:\\screenshots\\screenshot.png";

            // Сохраняем скриншот в файл
            File file = new File(filePath);
            ImageIO.write(screenshot, "png", file);

            System.out.println("Скриншот успешно сохранен в " + filePath);
        } catch (AWTException | IOException ex) {
            System.err.println("Ошибка при сохранении скриншота: " + ex.getMessage());
        }
    }
}

package SegundoTrimestre.entregas;

/**
 * The WebCam class represents a webcam with attributes such as frames per second (fps),
 * resolution, state (on/off), and memory usage in megabytes (Mb). It provides methods
 * to turn the webcam on and off, and to take a photo.
 *
 * <p>Example usage:</p>
 * <pre>
 * {@code
 * WebCam webcam = new WebCam(30, "1920x1080", false, 0);
 * webcam.tomarFoto(); // Attempt to take a photo (will fail because the camera is off)
 * webcam.encender(); // Turn on the camera
 * webcam.tomarFoto(); // Attempt to take a photo (will succeed)
 * webcam.apagar(); // Turn off the camera
 * }
 * </pre>
 *
 * <p>Attributes:</p>
 * <ul>
 *   <li>fps - Frames per second</li>
 *   <li>resolucion - Resolution of the webcam</li>
 *   <li>estado - State of the webcam (true for on, false for off)</li>
 *   <li>Mb - Memory usage in megabytes</li>
 * </ul>
 *
 * <p>Methods:</p>
 * <ul>
 *   <li>{@link #WebCam(int, String, boolean, int)} - Constructor to initialize the attributes</li>
 *   <li>{@link #getFps()} - Getter for fps</li>
 *   <li>{@link #setFps(int)} - Setter for fps</li>
 *   <li>{@link #getResolucion()} - Getter for resolution</li>
 *   <li>{@link #setResolucion(String)} - Setter for resolution</li>
 *   <li>{@link #isEstado()} - Getter for state (boolean)</li>
 *   <li>{@link #setEstado(boolean)} - Setter for state</li>
 *   <li>{@link #getMb()} - Getter for memory usage in megabytes</li>
 *   <li>{@link #setMb(int)} - Setter for memory usage in megabytes</li>
 *   <li>{@link #encender()} - Method to turn on the webcam</li>
 *   <li>{@link #apagar()} - Method to turn off the webcam</li>
 *   <li>{@link #tomarFoto()} - Method to take a photo</li>
 * </ul>
 */
public class WebCam {

    public static void main(String[] args) {
        WebCam webcam = new WebCam(30, "1920x1080", false, 0);

        webcam.tomarFoto(); // Intentar tomar una foto (fallará porque la cámara está apagada)
        webcam.encender(); // Encender la cámara
        webcam.tomarFoto(); // Intentar tomar una foto (funcionará)
        webcam.apagar();
    }

    // Atributos de la clase WebCam
    private int fps;
    private String resolucion;
    private boolean estado;
    private int Mb;

    // Constructor para inicializar los atributos de la clase
    public WebCam(int fps, String resolucion, boolean estado, int Mb) {
        this.fps = fps;
        this.resolucion = resolucion;
        this.estado = estado;
        this.Mb = Mb;
    }

    // Getters y setters para los atributos
    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    // Método getter para el estado (booleano)
    public boolean isEstado() // Se usa is en lugar de get para booleanos
    {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMb() {
        return Mb;
    }

    public void setMb(int Mb) {
        this.Mb = Mb;
    }

    // Método para encender la cámara
    public void encender() {
        this.estado = true;
    }

    // Método para apagar la cámara
    public void apagar() {
        this.estado = false;
    }

    // Método para tomar una foto
    public void tomarFoto() {
        int ancho = 1920;
        int alto = 1080;
        int FPS = this.fps;
        // Creacion de variable para definir el tamaño estimado del archivo de la foto
        double tamaño = (ancho * alto * FPS) / 1000000.0;
        if(this.estado) {
            System.out.println("Foto tomada con una resolucion de: "+resolucion+" y un tamaño estimado de archivo de: "+tamaño+" Mb");
        } else {
            System.out.println("No es posible tomar la foto, la camara está apagada");
        }
    }
}

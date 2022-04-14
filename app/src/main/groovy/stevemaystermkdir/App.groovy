package stevemaystermkdir

class App {
    static void main(String[] args) {
        // normally this would return false but because of the
        // src/main/groovy/stevemaystermkdir/FileExtension.groovy class
        // this will throw an exception
        new File('/some/path/that/cannot/be/created').mkdir()
    }
}

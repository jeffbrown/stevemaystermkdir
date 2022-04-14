package stevemaystermkdir

import groovy.transform.CompileStatic

class FileExtension {

    // this method needs to be statically compiled, if it were using
    // dynamic dispatch the call to targetObject.mkdir() below would
    // be invoking this method again and a StackOverflowError would result
    //
    // And there is no benefit to using dynamic dispatch in this code
    @CompileStatic
    static void mkdir(File targetObject) {
        if (!targetObject.mkdir()) {
            throw new Exception("Something went wrong creating the directory ${targetObject.absolutePath}")
        }
        true
    }
}

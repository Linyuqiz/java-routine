package main.byteCode;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;
import org.objectweb.asm.commons.SimpleRemapper;

/**
 * @author: axemc
 * @dateTime: 2022/04/10 01:37:39
 */
public class ASMByteCodeTest {

    @Test
    @SneakyThrows
    void bytecode() {
        ClassReader classReader = new ClassReader("");
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        Remapper remapper = new SimpleRemapper("", "");
        ClassVisitor classVisitor = new ClassRemapper(classWriter, remapper);
        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
    }

}

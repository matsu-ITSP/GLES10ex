package jp.ac.titech.itpro.sdl.gles10ex;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Sandglass implements SimpleRenderer.Obj {

    private final static float[] VERTICES = {
            // left
            -2, -2, -1,
            -1, -1, 0,
            -2, 2, -1,
            -1, 1, 0,
            // right
            2, -2, -1,
            1, -1, 0,
            2, 2, -1,
            1, 1, 0,
            // bottom
            -2, -2, -1,
            2, -2, -1,
            -1, -1, 0,
            1, -1, 0,
            // top
            -2, 2, -1,
            2, 2, -1,
            -1, 1, 0,
            1, 1, 0,
            // back
            -2, -2, -1,
            -2, 2, -1,
            2, -2, -1,
            2, 2, -1,
            // front
            -1, -1, 0,
            -1, 1, 0,
            1, -1, 0,
            1, 1, 0,
            // left
            -2, -2, 1,
            -1, -1, 0,
            -2, 2, 1,
            -1, 1, 0,
            // right
            2, -2, 1,
            1, -1, 0,
            2, 2, 1,
            1, 1, 0,
            // bottom
            -2, -2, 1,
            2, -2, 1,
            -1, -1, 0,
            1, -1, 0,
            // top
            -2, 2, 1,
            2, 2, 1,
            -1, 1, 0,
            1, 1, 0,
            // back
            -2, -2, 1,
            -2, 2, 1,
            2, -2, 1,
            2, 2, 1,
    };

    private final FloatBuffer vbuf;

    Sandglass() {
        vbuf = ByteBuffer.allocateDirect(VERTICES.length * 4)
                .order(ByteOrder.nativeOrder()).asFloatBuffer();
        vbuf.put(VERTICES);
        vbuf.position(0);
    }

    public void draw(GL10 gl) {
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vbuf);

        // left
        gl.glNormal3f(-1, 0, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4);

        // right
        gl.glNormal3f(1, 0, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 4, 4);

        // bottom
        gl.glNormal3f(0, -1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 8, 4);

        // top
        gl.glNormal3f(0, 1, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 12, 4);

        // rear
        gl.glNormal3f(0, 0, -1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 16, 4);

        // front
        gl.glNormal3f(0, 0, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 20, 4);

        // left
        gl.glNormal3f(-1, 0, -1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 24, 4);

        // right
        gl.glNormal3f(1, 0, -1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 28, 4);

        // bottom
        gl.glNormal3f(0, -1, -1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 32, 4);

        // top
        gl.glNormal3f(0, 1, -1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 36, 4);

        // rear
        gl.glNormal3f(0, 0, 1);
        gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 40, 4);
    }

}

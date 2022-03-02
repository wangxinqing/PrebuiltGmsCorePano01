package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: apdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apdw extends apdm {
    private int f;
    private final int g;
    public String h;
    protected final int i;
    protected final int j;
    private final int k;
    private final int l;

    protected apdw(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
        int i2;
        new HashMap();
        new HashMap();
        this.f = byteBuffer.getInt();
        int position = byteBuffer.position();
        byte[] array = byteBuffer.array();
        int i3 = position;
        while (true) {
            i2 = 0;
            if (i3 >= array.length || i3 >= position + PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                break;
            } else if (array[i3] == 0 && array[i3 + 1] == 0) {
                i2 = i3 - position;
                break;
            } else {
                i3 += 2;
            }
        }
        String str = new String(array, position, i2, Charset.forName("UTF-16LE"));
        byteBuffer.position(position + PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        this.h = str;
        this.i = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getInt();
        this.l = byteBuffer.getInt();
    }

    /* access modifiers changed from: protected */
    public void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i2 = this.i;
        int i3 = this.j;
        int i4 = 0;
        for (apdl apdl : this.e.values()) {
            if (apdl == d()) {
                i2 = i4 + this.b;
            } else if (apdl == e()) {
                i3 = i4 + this.b;
            }
            byte[] c = apdl.c();
            dataOutput.write(c);
            i4 = apdl.a(dataOutput, c.length);
        }
        byteBuffer.putInt(268, i2);
        byteBuffer.putInt(276, i3);
    }

    public apei d() {
        apdl apdl = (apdl) this.e.get(Integer.valueOf(this.i + this.d));
        amrl.a((Object) apdl);
        amrl.b(apdl instanceof apei, (Object) "Type string pool not found.");
        return (apei) apdl;
    }

    public apei e() {
        apdl apdl = (apdl) this.e.get(Integer.valueOf(this.j + this.d));
        amrl.a((Object) apdl);
        amrl.b(apdl instanceof apei, (Object) "Key string pool not found.");
        return (apei) apdl;
    }

    /* access modifiers changed from: protected */
    public final apdk h() {
        return apdk.TABLE_PACKAGE;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f);
        byte[] bytes = this.h.getBytes(Charset.forName("UTF-16LE"));
        int length = bytes.length;
        byteBuffer.put(bytes, 0, Math.min(length, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        if (length < 256) {
            byteBuffer.put(new byte[(PSKKeyManager.MAX_KEY_LENGTH_BYTES - length)]);
        }
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.g);
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.k);
        byteBuffer.putInt(this.l);
    }
}

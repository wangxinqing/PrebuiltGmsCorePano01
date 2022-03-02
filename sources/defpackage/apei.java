package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: apei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apei extends apdl {
    protected final int e;
    protected final int f;
    protected final List g = new ArrayList();
    protected List h = new ArrayList();
    private final int i;

    protected apei(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.i = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
    }

    private final int e() {
        return (this.g.size() + this.h.size()) * 4;
    }

    public final String a(int i2) {
        return (String) this.g.get(i2);
    }

    /* access modifiers changed from: protected */
    public int b(DataOutput dataOutput, ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        List list = this.g;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String str = (String) list.get(i3);
            apea d = d();
            byte[] bytes = str.getBytes(d.c);
            int length = bytes.length;
            anmq a = anmr.a(length + 5);
            apeb.a(a, str.length(), d);
            if (d == apea.UTF8) {
                apeb.a(a, length, d);
            }
            a.write(bytes);
            if (d == apea.UTF8) {
                a.write(0);
            } else {
                a.writeShort(0);
            }
            byte[] byteArray = a.b.toByteArray();
            dataOutput.write(byteArray);
            hashMap.put(str, Integer.valueOf(i2));
            byteBuffer.putInt(i2);
            i2 += byteArray.length;
        }
        return apdl.a(dataOutput, i2);
    }

    public final apea d() {
        return (this.i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? apea.UTF8 : apea.UTF16;
    }

    /* access modifiers changed from: protected */
    public final apdk h() {
        return apdk.STRING_POOL;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer allocate = ByteBuffer.allocate(e());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        anni anni = new anni(byteArrayOutputStream);
        try {
            int b = b(anni, allocate);
            if (this.h.size() > 0) {
                HashMap hashMap = new HashMap();
                int i2 = 0;
                for (apeh apeh : this.h) {
                    byte[] b2 = apeh.b();
                    anni.write(b2);
                    hashMap.put(apeh, Integer.valueOf(i2));
                    allocate.putInt(i2);
                    i2 += b2.length;
                }
                anni.writeInt(-1);
                anni.writeInt(-1);
                apdl.a((DataOutput) anni, i2 + 8);
            }
            anmt.a((Closeable) anni);
            dataOutput.write(allocate.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
            if (!this.h.isEmpty()) {
                byteBuffer.putInt(24, this.b + e() + b);
            }
        } catch (Throwable th) {
            anmt.a((Closeable) anni);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.g.size());
        byteBuffer.putInt(this.h.size());
        byteBuffer.putInt(this.i);
        byteBuffer.putInt(this.b + e());
        byteBuffer.putInt(0);
    }
}

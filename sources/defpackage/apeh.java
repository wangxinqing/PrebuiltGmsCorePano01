package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: apeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apeh {
    protected apeh() {
    }

    static apeh a(ByteBuffer byteBuffer, apei apei) {
        ArrayList arrayList = new ArrayList();
        int i = byteBuffer.getInt();
        while (i != -1) {
            arrayList.add(new apdh(i, byteBuffer.getInt(), byteBuffer.getInt(), apei));
            i = byteBuffer.getInt();
        }
        return a(Collections.unmodifiableList(arrayList));
    }

    public abstract List a();

    /* JADX INFO: finally extract failed */
    public final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        anni anni = new anni(byteArrayOutputStream);
        try {
            for (apeg apeg : a()) {
                ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(apeg.a());
                order.putInt(apeg.b());
                order.putInt(apeg.c());
                byte[] array = order.array();
                if (array.length == 12) {
                    anni.write(array);
                } else {
                    throw new IllegalStateException("Encountered a span of invalid length.");
                }
            }
            anni.writeInt(-1);
            anmt.a((Closeable) anni);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            anmt.a((Closeable) anni);
            throw th;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "StringPoolStyle{spans=%s}", new Object[]{a()});
    }

    static apeh a(List list) {
        return new apdi(list);
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wuy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wuy implements wuj {
    List a = new ArrayList();
    String b;

    public wuy(String str, List list) {
        this.b = str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.a.add(auay.a(String.valueOf((String) list.get(i)).concat("\n")));
        }
    }

    public final int a() {
        List list = this.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((auay) list.get(i2)).a();
        }
        return i;
    }

    public final String b() {
        return this.b;
    }

    public final byte[] a(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        List list = this.a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            auay auay = (auay) list.get(i2);
            if (i != Integer.MAX_VALUE && i < auay.a() + i3) {
                break;
            }
            try {
                auay.a((OutputStream) byteArrayOutputStream);
                i3 += auay.a();
                i2++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final Map c() {
        return anfu.b;
    }
}

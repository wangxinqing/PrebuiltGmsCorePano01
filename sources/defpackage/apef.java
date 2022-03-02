package defpackage;

import com.google.android.chimera.Service;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* renamed from: apef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apef {
    public static apef a(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        byteBuffer.get();
        byte b = byteBuffer.get();
        apee apee = (apee) apee.r.get(Byte.valueOf(b));
        amrl.a((Object) apee, "Unknown resource type: %s", (int) b);
        int i = byteBuffer.getInt();
        aped d = d();
        d.b((char) s);
        d.a(apee);
        d.a(i);
        return d.a();
    }

    public static aped d() {
        return new aped();
    }

    private final String f() {
        return String.format("0x%08x", new Object[]{Integer.valueOf(c())});
    }

    public abstract int a();

    public abstract apee b();

    public abstract int c();

    public final byte[] e() {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) a());
        order.put((byte) 0);
        order.put(b().q);
        order.putInt(c());
        return order.array();
    }

    public final String toString() {
        apee apee = apee.NULL;
        switch (b().ordinal()) {
            case 0:
                return c() != 0 ? "empty" : "null";
            case 1:
                String f = f();
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 5);
                sb.append("ref(");
                sb.append(f);
                sb.append(")");
                return sb.toString();
            case 2:
                String f2 = f();
                StringBuilder sb2 = new StringBuilder(String.valueOf(f2).length() + 6);
                sb2.append("attr(");
                sb2.append(f2);
                sb2.append(")");
                return sb2.toString();
            case 3:
                String f3 = f();
                StringBuilder sb3 = new StringBuilder(String.valueOf(f3).length() + 8);
                sb3.append("string(");
                sb3.append(f3);
                sb3.append(")");
                return sb3.toString();
            case 4:
                int c = c();
                StringBuilder sb4 = new StringBuilder(18);
                sb4.append("float(");
                sb4.append(c);
                sb4.append(")");
                return sb4.toString();
            case 5:
                int c2 = c();
                StringBuilder sb5 = new StringBuilder(18);
                sb5.append("dimen(");
                sb5.append(c2);
                sb5.append(")");
                return sb5.toString();
            case 6:
                int c3 = c();
                StringBuilder sb6 = new StringBuilder(17);
                sb6.append("frac(");
                sb6.append(c3);
                sb6.append(")");
                return sb6.toString();
            case 7:
                String f4 = f();
                StringBuilder sb7 = new StringBuilder(String.valueOf(f4).length() + 8);
                sb7.append("dynref(");
                sb7.append(f4);
                sb7.append(")");
                return sb7.toString();
            case 8:
                String f5 = f();
                StringBuilder sb8 = new StringBuilder(String.valueOf(f5).length() + 9);
                sb8.append("dynattr(");
                sb8.append(f5);
                sb8.append(")");
                return sb8.toString();
            case 9:
                int c4 = c();
                StringBuilder sb9 = new StringBuilder(16);
                sb9.append("dec(");
                sb9.append(c4);
                sb9.append(")");
                return sb9.toString();
            case 10:
                String f6 = f();
                StringBuilder sb10 = new StringBuilder(String.valueOf(f6).length() + 5);
                sb10.append("hex(");
                sb10.append(f6);
                sb10.append(")");
                return sb10.toString();
            case 11:
                int c5 = c();
                StringBuilder sb11 = new StringBuilder(17);
                sb11.append("bool(");
                sb11.append(c5);
                sb11.append(")");
                return sb11.toString();
            case 12:
                String f7 = f();
                StringBuilder sb12 = new StringBuilder(String.valueOf(f7).length() + 7);
                sb12.append("argb8(");
                sb12.append(f7);
                sb12.append(")");
                return sb12.toString();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                String f8 = f();
                StringBuilder sb13 = new StringBuilder(String.valueOf(f8).length() + 6);
                sb13.append("rgb8(");
                sb13.append(f8);
                sb13.append(")");
                return sb13.toString();
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                String f9 = f();
                StringBuilder sb14 = new StringBuilder(String.valueOf(f9).length() + 7);
                sb14.append("argb4(");
                sb14.append(f9);
                sb14.append(")");
                return sb14.toString();
            case Service.START_CONTINUATION_MASK:
                String f10 = f();
                StringBuilder sb15 = new StringBuilder(String.valueOf(f10).length() + 6);
                sb15.append("rgb4(");
                sb15.append(f10);
                sb15.append(")");
                return sb15.toString();
            default:
                return "<invalid value>";
        }
    }
}

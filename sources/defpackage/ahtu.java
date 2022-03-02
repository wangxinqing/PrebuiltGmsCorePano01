package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: ahtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahtu implements atig {
    public final atho a;
    public final Map b;
    public final Map c;

    public ahtu(Context context) {
        int i = ahvx.b;
        athm athm = new athm();
        String a2 = aeeg.a(context.getContentResolver(), "collectionlib:masf_address");
        athm.a = TextUtils.isEmpty(a2) ? "https://www.google.com/loc/m/api" : a2;
        athm.b = "location";
        athm.c = "1.0";
        athm.d = "android";
        athm.e = "collectionlib";
        atho.a(athm);
        this.a = atho.a();
        this.b = ahvx.b();
        this.c = ahvx.b();
    }

    public static ahul a(aqek aqek, String str) {
        if (aqek != null) {
            return new ahul(aqek, (String) null);
        }
        return new ahul((aqek) null, str);
    }

    private final void a(atih atih, aqek aqek, String str) {
        ahtt ahtt = (ahtt) this.b.remove(atih);
        if (ahtt == null) {
            aiba aiba = (aiba) this.c.remove(atih);
            if (aiba != null && aiba.b != null) {
                aqek aqek2 = (aqek) aiba.a;
                if (!aydu.a.a().verifyGlocStatus()) {
                    ((ahsb) aiba.b).a(aqek2, a(aqek, str));
                    return;
                }
                amrl.a((Object) aqek2);
                ((ahsb) aiba.b).a(aqek2, a(aqek, str));
                return;
            }
            return;
        }
        ahtt.b = aiba.a(aqek, str);
        ahtt.a.countDown();
    }

    public final atih a(String str, aqek aqek) {
        try {
            atid atid = new atid(str, aqek.b());
            atid.a((atig) this);
            return atid;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final void a(atih atih, atii atii) {
        String str;
        aqek aqek = null;
        try {
            int i = atii.b;
            if (i != 200) {
                StringBuilder sb = new StringBuilder(28);
                sb.append("Server error, RC=");
                sb.append(i);
                str = sb.toString();
            } else {
                InputStream b2 = atii.b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = b2.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                aqek aqek2 = new aqek(ajck.an);
                aqek2.a(byteArray);
                if (!aqek2.a()) {
                    throw new IOException("isValid returned after parsing reply");
                } else if (aqek2.b(1) != 0) {
                    str = String.format("GLS error: %s", new Object[]{Integer.valueOf(aqek2.b(1))});
                } else {
                    str = null;
                    aqek = aqek2;
                }
            }
        } catch (IOException e) {
            str = String.format("Failed to read data from MASF: %s", new Object[]{e.getMessage()});
        }
        a(atih, aqek, str);
    }

    public final void a(atih atih, Exception exc) {
        a(atih, (aqek) null, String.format("Failed to send data to MASF: %s", new Object[]{exc.getMessage()}));
    }
}

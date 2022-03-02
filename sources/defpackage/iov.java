package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* renamed from: iov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iov extends yey {
    private final Context a;

    public iov(Context context) {
        super(context);
        this.a = context;
    }

    public final acwa a(String str) {
        acwa a2;
        yfg a3 = yfg.a(this.a);
        try {
            new ygx(str, this.a.getPackageName()).a(this.a, a3);
            a2 = acws.a((Object) null);
        } catch (yfx e) {
            int i = e.a;
            if (i == 29512) {
                a2 = acws.a((Object) null);
            } else {
                throw new yfy(i, e.b, e);
            }
        } catch (Throwable th) {
            a3.close();
            throw th;
        }
        a3.close();
        return a2;
    }

    public final acwa b(String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    public final acwa g(String str) {
        throw new UnsupportedOperationException();
    }

    public final acwa a(String str, int i, String[] strArr, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final acwa a(String str, int i, String[] strArr, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public final acwa a(String str, String str2, String str3) {
        acwa a2;
        yfg a3 = yfg.a(this.a);
        try {
            a2 = acws.a((Object) new yhe(str, str2, str3, str, this.a.getPackageName()).a(this.a, a3));
        } catch (yfx e) {
            int i = e.a;
            if (i == 29512) {
                a2 = acws.a((Object) new Configurations("", "", new Configuration[0], false, (byte[]) null, 0));
            } else {
                throw new yfy(i, e.b, e);
            }
        } catch (Throwable th) {
            a3.close();
            throw th;
        }
        a3.close();
        return a2;
    }

    public final acwa a(String str, String str2, Flag[] flagArr) {
        throw new UnsupportedOperationException();
    }
}

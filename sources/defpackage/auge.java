package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: auge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class auge {
    protected volatile int a = -1;

    public abstract void a();

    public final /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            augf.a((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(e.getMessage());
            return valueOf.length() == 0 ? new String("Error printing proto: ") : "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            return valueOf2.length() == 0 ? new String("Error printing proto: ") : "Error printing proto: ".concat(valueOf2);
        }
    }
}

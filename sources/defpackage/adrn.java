package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: adrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adrn {
    public static final adqz a = new adrm();
    private final SharedPreferences b;
    private final Object c = new Object();

    protected adrn(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.update.storage", 0);
    }

    public final adrc a(adri adri) {
        return new adrc(adri, b(adri));
    }

    public final Object b(adri adri) {
        String string;
        synchronized (this.c) {
            string = this.b.getString(adri.a, (String) null);
        }
        return string == null ? adri.b : adri.a(string);
    }

    public final void a(List list) {
        synchronized (this.c) {
            SharedPreferences.Editor edit = this.b.edit();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                adrc adrc = (adrc) it.next();
                edit.putString(adrc.a.a, adrc.a());
            }
            edit.commit();
        }
    }

    public final void a(adrc... adrcArr) {
        a(Arrays.asList(adrcArr));
    }

    public final void a(adri... adriArr) {
        List<adri> asList = Arrays.asList(adriArr);
        synchronized (this.c) {
            SharedPreferences.Editor edit = this.b.edit();
            for (adri adri : asList) {
                edit.remove(adri.a);
            }
            edit.commit();
        }
    }
}

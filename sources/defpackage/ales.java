package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.places.PlacesLoggingChimeraService;

/* renamed from: ales  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ales {
    public final aucd a;
    private final String b;
    private final int c;
    private final String d;

    public ales(ComponentName componentName, Bundle bundle) {
        iva.a((Object) bundle);
        aucd o = aodu.f.o();
        this.a = o;
        if (componentName != null) {
            String shortClassName = componentName.getShortClassName();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aodu aodu = (aodu) o.b;
            shortClassName.getClass();
            aodu.a |= 2;
            aodu.b = shortClassName;
            this.b = componentName.getPackageName();
        } else {
            this.b = null;
        }
        if ("com.google.android.gms".equals(this.b)) {
            this.d = bundle.getString("gcore_client_name");
        } else {
            this.d = null;
        }
        this.c = bundle.getInt("gmscore_client_jar_version", 0);
    }

    public final void a() {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aodu aodu = (aodu) aucd.b;
        aodu aodu2 = aodu.f;
        aodu.a &= -65;
        aodu.c = 0;
        aucd aucd2 = this.a;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aodu aodu3 = (aodu) aucd2.b;
        aodu3.a &= -513;
        aodu3.e = 0;
        aucd aucd3 = this.a;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodu aodu4 = (aodu) aucd3.b;
        aodu4.a &= -129;
        aodu4.d = 0;
    }

    public final void a(Context context) {
        int i;
        if (azbe.a.a().m()) {
            if ((((aodu) this.a.b).a & 64) == 0 && Log.isLoggable("Places", 5)) {
                Log.w("Places", "Logging result without specifying a selection");
            }
            String str = this.b;
            try {
                i = jni.b(context).b(str, 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("Places", 5)) {
                    Log.w("Places", "Failed to get package's version code: ", e);
                }
                i = 0;
            }
            aoei a2 = akig.a(4, str, i, this.c, this.d, 0);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            aucd aucd2 = this.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei = (aoei) aucd.b;
            aodu aodu = (aodu) aucd2.i();
            aoei aoei2 = aoei.w;
            aodu.getClass();
            aoei.k = aodu;
            aoei.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            PlacesLoggingChimeraService.a(context, (aoei) aucd.i());
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kc implements Iterable {
    private final ArrayList a = new ArrayList();
    private final Context b;

    private kc(Context context) {
        this.b = context;
    }

    public static kc a(Context context) {
        return new kc(context);
    }

    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final void a() {
        if (!this.a.isEmpty()) {
            ArrayList arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.b;
            int i = Build.VERSION.SDK_INT;
            context.startActivities(intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public final void a(Activity activity) {
        Intent intent;
        if (activity instanceof kb) {
            intent = ((kb) activity).aG();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = iz.b(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.b.getPackageManager());
            }
            int size = this.a.size();
            try {
                Intent a2 = iz.a(this.b, component);
                while (a2 != null) {
                    this.a.add(size, a2);
                    a2 = iz.a(this.b, a2.getComponent());
                }
                this.a.add(intent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }
}

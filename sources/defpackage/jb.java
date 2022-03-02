package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: jb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jb {
    public boolean a;
    public final Bundle b;
    public ArrayList c;
    private final IconCompat d;
    private final CharSequence e;
    private final PendingIntent f;
    private boolean g;

    public jb(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompat;
        if (i != 0) {
            iconCompat = IconCompat.a((Resources) null, "", i);
        } else {
            iconCompat = null;
        }
        Bundle bundle = new Bundle();
        this.a = true;
        this.g = true;
        this.d = iconCompat;
        this.e = je.a(charSequence);
        this.f = pendingIntent;
        this.b = bundle;
        this.c = null;
        this.a = true;
        this.g = true;
    }

    public final jc a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.c;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                js jsVar = (js) arrayList3.get(i);
                boolean z = jsVar.d;
                arrayList2.add(jsVar);
            }
        }
        if (!arrayList.isEmpty()) {
            js[] jsVarArr = (js[]) arrayList.toArray(new js[arrayList.size()]);
        }
        return new jc(this.d, this.e, this.f, this.b, !arrayList2.isEmpty() ? (js[]) arrayList2.toArray(new js[arrayList2.size()]) : null, this.a, this.g);
    }
}

package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbp extends xff {
    public DataHolder b;
    public Cursor c;
    public ych d;
    public ych e;
    public ArrayList f;
    public HashMap g;
    public xbo h;
    public xbo i;
    public final boolean j;
    private volatile boolean k;
    private final int l;
    private Context m;

    public final int a() {
        d();
        return this.l;
    }

    public final void c() {
        if (!this.k) {
            this.k = true;
            this.b.close();
            this.c.close();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.m = null;
            this.h = null;
            this.i = null;
        }
    }

    public final void d() {
        if (this.k) {
            throw new IllegalStateException("Already released");
        }
    }

    public xbp(DataHolder dataHolder, Cursor cursor, Context context, int i2, ych ych, ych ych2, ArrayList arrayList, HashMap hashMap, Bundle bundle) {
        super(dataHolder);
        boolean z;
        boolean z2;
        iva.a((Object) dataHolder);
        iva.a((Object) cursor);
        iva.a((Object) hashMap);
        boolean z3 = true;
        if (i2 == ych.a()) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (i2 == ych2.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        iva.b(i2 != arrayList.size() ? false : z3);
        this.b = dataHolder;
        this.c = cursor;
        this.l = i2;
        this.f = arrayList;
        this.m = context;
        this.g = hashMap;
        this.h = new xbl(this.m.getResources());
        this.i = new xbm(this.m.getResources());
        this.d = ych;
        this.e = ych2;
        this.j = false;
        new xcb(bundle);
    }

    public final /* bridge */ /* synthetic */ Object a(int i2) {
        d();
        return new xbn(this, i2);
    }
}

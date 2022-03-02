package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: kyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kyl implements kyq {
    public final String a;
    public final Set b;
    private final Set c;
    private final int d;

    protected kyl(String str, int i) {
        iva.a((Object) str, (Object) "fieldName");
        this.a = str;
        this.b = Collections.singleton(str);
        this.c = Collections.emptySet();
        this.d = i;
    }

    public final Object a(Bundle bundle) {
        iva.a((Object) bundle, (Object) "bundle");
        if (bundle.get(this.a) != null) {
            return b(bundle);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object a(Object obj, Object obj2) {
        return obj;
    }

    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bundle bundle, Object obj);

    /* access modifiers changed from: protected */
    public abstract Object b(Bundle bundle);

    public final Collection b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract Object c(DataHolder dataHolder, int i, int i2);

    public final Collection c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String toString() {
        return this.a;
    }

    protected kyl(String str, Collection collection, Collection collection2, int i) {
        iva.a((Object) str, (Object) "fieldName");
        this.a = str;
        this.b = Collections.unmodifiableSet(new HashSet(collection));
        this.c = Collections.unmodifiableSet(new HashSet(collection2));
        this.d = i;
    }

    public final Object a(DataHolder dataHolder, int i, int i2) {
        if (b(dataHolder, i, i2)) {
            return c(dataHolder, i, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(com.google.android.gms.common.data.DataHolder r4, int r5, int r6) {
        /*
            r3 = this;
            java.util.Set r0 = r3.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4.b()
            if (r2 != 0) goto L_0x0024
            boolean r2 = r4.a((java.lang.String) r1)
            if (r2 == 0) goto L_0x0024
            boolean r1 = r4.f(r1, r5, r6)
            if (r1 == 0) goto L_0x0006
        L_0x0024:
            r4 = 0
            return r4
        L_0x0026:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyl.b(com.google.android.gms.common.data.DataHolder, int, int):boolean");
    }

    public final void a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        iva.a((Object) dataHolder, (Object) "dataHolder");
        iva.a((Object) metadataBundle, (Object) "bundle");
        if (b(dataHolder, i, i2)) {
            metadataBundle.b(this, c(dataHolder, i, i2));
        }
    }

    public final void a(MetadataBundle metadataBundle, MetadataBundle metadataBundle2) {
        iva.a((Object) metadataBundle, (Object) "bottom");
        iva.a((Object) metadataBundle2, (Object) "top");
        if (metadataBundle2.c(this)) {
            Object a2 = metadataBundle2.a((kyq) this);
            Object a3 = metadataBundle.a((kyq) this);
            if (a3 == null) {
                metadataBundle.b(this, a2);
            } else {
                metadataBundle.b(this, a(a2, a3));
            }
        }
    }

    public final void a(Object obj, Bundle bundle) {
        iva.a((Object) bundle, (Object) "bundle");
        if (obj == null) {
            bundle.putString(this.a, (String) null);
        } else {
            a(bundle, obj);
        }
    }
}

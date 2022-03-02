package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zek {
    public int a;
    public float b;
    public int c;
    public float d;
    public int e;
    public float f;
    public int g;
    public int h;
    public final Set i = new HashSet();
    private int j;

    public final zel a() {
        return new AclDetailsEntity(this.i, this.j, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void a(int i2) {
        this.j = i2;
        this.i.add(5);
    }
}

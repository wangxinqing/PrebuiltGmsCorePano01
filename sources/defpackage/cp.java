package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cp {
    public final cf a;
    public final cs b;
    public Executor c;
    public Executor d;

    public cp(cf cfVar, cs csVar) {
        if (cfVar == null) {
            throw new IllegalArgumentException("DataSource may not be null");
        } else if (csVar != null) {
            this.a = cfVar;
            this.b = csVar;
        } else {
            throw new IllegalArgumentException("Config may not be null");
        }
    }
}

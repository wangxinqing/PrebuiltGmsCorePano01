package defpackage;

/* renamed from: alqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alqu implements alqq {
    final /* synthetic */ alqv a;

    public alqu(alqv alqv) {
        this.a = alqv;
    }

    public final void a() {
        alqv alqv = this.a;
        aloy aloy = alqv.c;
        if (aloy != null) {
            int i = alqv.a;
            String sb = alqv.b.toString();
            if (i == 200) {
                try {
                    if (aloy.a != null) {
                        try {
                            if (sb.startsWith(")]}'\n")) {
                                sb = sb.substring(5);
                            }
                            aloy.b.a(aloy.a.a(new alze(sb)));
                        } catch (alry e) {
                            aloy.b.a(new alpj(500, e));
                        }
                    } else {
                        aloy.b.a((Object) null);
                    }
                } catch (RuntimeException e2) {
                    aloy.b.a(new alpj(0, e2));
                }
            } else if (i != 204) {
                aloy.b.a(new alpj(i));
                aloy.c.a(i);
            } else {
                aloy.b.a((Object) null);
            }
        }
    }

    public final void a(alqo alqo) {
    }

    public final void a(alqp alqp) {
        this.a.a = alqp.b;
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        synchronized (this.a.b) {
            this.a.b.append(charSequence, i, i2);
        }
    }
}

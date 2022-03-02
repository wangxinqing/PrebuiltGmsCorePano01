package defpackage;

/* renamed from: alqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alqk implements alqq {
    final /* synthetic */ alqg a;

    public alqk(alqg alqg) {
        this.a = alqg;
    }

    public final void a() {
        this.a.a(6);
    }

    public final void a(alqo alqo) {
        this.a.a(1, alqo.a, -1);
    }

    public final void a(alqp alqp) {
        int i = alqp.b;
        if (i != 200) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Server returned non-OK response code: ");
            sb.append(i);
            this.a.a(2, new IllegalStateException(sb.toString()), alqp.b);
            return;
        }
        this.a.a(3);
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        synchronized (this.a) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '1') {
                    alqg alqg = this.a;
                    int i3 = alqg.a + 1;
                    alqg.a = i3;
                    if (i3 == 1) {
                        alqg.b = System.currentTimeMillis();
                    }
                    alqg alqg2 = this.a;
                    long j = (long) alqg2.a;
                    if (j == 5) {
                        alqg2.a(4);
                    } else if (j > 5) {
                        alqg2.a(4, new IllegalStateException("Too many stage one responses received."), -1);
                    }
                } else if (charAt != '2') {
                    String valueOf = String.valueOf(charSequence);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Unexpected response from server: ");
                    sb.append(valueOf);
                    this.a.a(4, new IllegalStateException(sb.toString()), -1);
                } else {
                    this.a.a(5);
                    this.a.c = System.currentTimeMillis();
                }
                i++;
            }
        }
    }
}

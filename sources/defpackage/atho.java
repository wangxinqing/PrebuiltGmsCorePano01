package defpackage;

/* renamed from: atho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atho {
    private static atho a;
    private final athn b;

    protected atho(athn athn) {
        this.b = athn;
    }

    public static synchronized atho a() {
        atho atho;
        synchronized (atho.class) {
            if (a == null) {
                String googleLocationServer = aydu.a.a().googleLocationServer();
                String str = "https://www.google.com/loc/m/api";
                if (googleLocationServer != null && googleLocationServer.length() > 0) {
                    String[] split = googleLocationServer.split(" ", 4);
                    if (split.length == 3 && split[0].equals(str) && split[1].equals("rewrite")) {
                        str = split[2];
                    }
                }
                athm athm = new athm();
                athm.a = str;
                athm.b = "location";
                athm.c = Integer.toString(2023);
                athm.d = "android";
                athm.e = "gms";
                a = a(athm);
            }
            atho = a;
        }
        return atho;
    }

    public static synchronized atho a(athm athm) {
        atho atho;
        synchronized (atho.class) {
            if (a == null) {
                athn.a(athm);
                a = new atho(athn.a());
            }
            atho = a;
        }
        return atho;
    }

    public final synchronized void a(atih atih) {
        athn athn = this.b;
        synchronized (athn.f) {
            if (atih.d == -1) {
                atih.d = System.currentTimeMillis();
            }
            atih.a(athn.d());
            if (atih.b != -1) {
                athn.e.put(atih, "");
                athn.b();
            } else {
                athn.d.add(atih);
                athn.c();
            }
        }
    }
}

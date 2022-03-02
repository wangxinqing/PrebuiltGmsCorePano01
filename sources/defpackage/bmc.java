package defpackage;

/* renamed from: bmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bmc implements Runnable {
    final /* synthetic */ bml a;

    public bmc(bml bml) {
        this.a = bml;
    }

    public final void run() {
        while (true) {
            bmd bmd = (bmd) this.a.i.poll();
            if (bmd != null) {
                Thread currentThread = Thread.currentThread();
                String name = getClass().getName();
                String name2 = bmd.b.getClass().getName();
                String action = bmd.a.getAction();
                int length = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(name2).length() + String.valueOf(action).length());
                sb.append("[");
                sb.append(name);
                sb.append("] processing ");
                sb.append(name2);
                sb.append(" for action ");
                sb.append(action);
                currentThread.setName(sb.toString());
                bmd.run();
            } else {
                Thread.currentThread().setName(this.a.b);
                return;
            }
        }
    }
}

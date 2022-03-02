package defpackage;

/* renamed from: huf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class huf implements amqy {
    private final long a;
    private final huk b;
    private final aucd c;

    public huf(long j, huk huk, aucd aucd) {
        this.a = j;
        this.b = huk;
        this.c = aucd;
    }

    public final Object a(Object obj) {
        long j = this.a;
        huk huk = this.b;
        aucd aucd = this.c;
        avra avra = (avra) obj;
        int i = huv.a;
        aucd aucd2 = (aucd) avra.c(5);
        aucd2.a((aucj) avra);
        int i2 = 0;
        while (i2 < ((avra) aucd2.b).a.size()) {
            avqz avqz = (avqz) ((avra) aucd2.b).a.get(i2);
            if (avqz.d < j) {
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                avra avra2 = (avra) aucd2.b;
                avra avra3 = avra.b;
                avra2.c();
                avra2.a.remove(i2);
                i2--;
            } else if (huk.compareTo(new huk((long) avqz.b, avqz.c)) < 0) {
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                avra avra4 = (avra) aucd2.b;
                avqz avqz2 = (avqz) aucd.i();
                avra avra5 = avra.b;
                avqz2.getClass();
                avra4.c();
                avra4.a.add(i2, avqz2);
                return (avra) aucd2.i();
            }
            i2++;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        avra avra6 = (avra) aucd2.b;
        avqz avqz3 = (avqz) aucd.i();
        avra avra7 = avra.b;
        avqz3.getClass();
        avra6.c();
        avra6.a.add(avqz3);
        return (avra) aucd2.i();
    }
}

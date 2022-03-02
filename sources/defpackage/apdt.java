package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: apdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdt extends apel implements apdn {
    private boolean h = true;

    protected apdt(annh annh, apdl apdl) {
        super(apdo.b(annh), apdl);
    }

    private final boolean g() {
        if (this.h && e().equals("string")) {
            TreeSet treeSet = new TreeSet();
            for (apek apek : this.g.values()) {
                if (apek.j()) {
                    return false;
                }
                apef d = apek.d();
                amrl.a((Object) d);
                apee b = d.b();
                if (b != apee.STRING && b != apee.REFERENCE) {
                    return false;
                }
                treeSet.add(Integer.valueOf(apek.b()));
            }
            if (treeSet.size() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.h = false;
    }

    /* access modifiers changed from: protected */
    public final short b() {
        return (short) (g() ? apdk.TABLE_TYPE.q | 4096 : apdk.TABLE_TYPE.q);
    }

    /* access modifiers changed from: protected */
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        boolean z;
        if (g()) {
            ArrayList arrayList = new ArrayList();
            TreeSet treeSet = new TreeSet();
            int i = 0;
            for (int i2 = 0; i2 < this.e; i2++) {
                Map map = this.g;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    apek apek = (apek) this.g.get(valueOf);
                    amrl.a((Object) apek);
                    treeSet.add(Integer.valueOf(apek.b()));
                    boolean z2 = true;
                    if (apek.j() || treeSet.size() != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    amrl.b(z);
                    apef d = apek.d();
                    amrl.a((Object) d);
                    if (!(d.b() == apee.STRING || d.b() == apee.REFERENCE)) {
                        z2 = false;
                    }
                    amrl.b(z2);
                    if (d.b() == apee.REFERENCE) {
                        arrayList.add(-3);
                    }
                    int c = d.c();
                    if (c == 0) {
                        c = -2;
                    }
                    arrayList.add(Integer.valueOf(c));
                    int c2 = apek.c();
                    arrayList.add(Integer.valueOf(c2 - i));
                    i = c2;
                } else {
                    arrayList.add(0);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            arbl.a(arrayList.size(), byteArrayOutputStream);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arbl.a(((Integer) arrayList.get(i3)).intValue(), byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            dataOutput.writeInt(((Integer) anbs.b(treeSet)).intValue());
            dataOutput.write(byteArray);
            apdl.a(dataOutput, byteArray.length);
            return;
        }
        super.a(dataOutput, byteBuffer);
    }
}

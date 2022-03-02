package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: andq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class andq extends andd {
    private static final long serialVersionUID = 3;

    public andq(andr andr, andr andr2, amqw amqw, int i, ConcurrentMap concurrentMap) {
        super(andr, andr2, amqw, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        andb andb = new andb();
        int i = andb.b;
        boolean z6 = false;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, "initial capacity was already set to %s", i);
        if (readInt >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2);
        andb.b = readInt;
        andb.a(this.a);
        andr andr = this.b;
        andr andr2 = andb.e;
        if (andr2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        amrl.b(z3, "Value strength was already set to %s", (Object) andr2);
        amrl.a((Object) andr);
        andb.e = andr;
        if (andr != andr.STRONG) {
            andb.a = true;
        }
        amqw amqw = this.c;
        amqw amqw2 = andb.f;
        if (amqw2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        amrl.b(z4, "key equivalence was already set to %s", (Object) amqw2);
        amrl.a((Object) amqw);
        andb.f = amqw;
        andb.a = true;
        int i2 = this.d;
        int i3 = andb.c;
        if (i3 == -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        amrl.b(z5, "concurrency level was already set to %s", i3);
        if (i2 > 0) {
            z6 = true;
        }
        amrl.a(z6);
        andb.c = i2;
        this.e = andb.e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                this.e.put(readObject, objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject((Object) null);
    }
}

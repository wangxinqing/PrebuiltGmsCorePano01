package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: amol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amol {
    private final Queue a = new LinkedList();
    private int b = 0;

    public final synchronized void a() {
        this.a.clear();
        this.b = 0;
    }

    public final synchronized byte[] a(amoj amoj) {
        if (this.a.isEmpty()) {
            if (!amoj.a()) {
                throw new amom("first packet does not have first packet bit");
            }
        }
        if (!this.a.isEmpty()) {
            if (amoj.a()) {
                throw new amom("continued packet should not have first packet bit");
            }
        }
        ByteBuffer duplicate = amoj.b.duplicate();
        duplicate.rewind();
        this.a.add(duplicate);
        int capacity = this.b + duplicate.capacity();
        this.b = capacity;
        if ((amoj.a[0] & 4) == 0) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(capacity);
        while (!this.a.isEmpty()) {
            allocate.put((ByteBuffer) this.a.poll());
        }
        this.b = 0;
        return allocate.array();
    }
}

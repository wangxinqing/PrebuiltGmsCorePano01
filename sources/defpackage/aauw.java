package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aauw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aauw {
    public Map a = new HashMap();
    public aaai b;
    public final ReadWriteLock c = new ReentrantReadWriteLock();
    public byte[] d;
    private byte[] e;
    private final int f;

    static {
        aauw.class.getSimpleName();
    }

    public aauw(int i) {
        this.f = i;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void a(Set set) {
        int i;
        this.c.readLock().lock();
        try {
            HashMap hashMap = new HashMap(this.a);
            aaai aaai = this.b;
            if (aaai != null) {
                aaah aaah = new aaah(aaai);
                while (true) {
                    int[] iArr = aaah.b.a;
                    if (iArr == null || (i = aaah.a) >= iArr.length) {
                        break;
                    }
                    long a2 = aaai.a((long) iArr[i]);
                    aaah.a++;
                    byte[] bArr = new byte[4];
                    bArr[3] = (byte) ((int) (255 & a2));
                    bArr[2] = (byte) ((int) ((65280 & a2) >>> 8));
                    bArr[1] = (byte) ((int) ((16711680 & a2) >>> 16));
                    bArr[0] = (byte) ((int) ((a2 & -16777216) >>> 24));
                    hashMap.put(new aaae(bArr), (Object) null);
                }
            }
            this.c.readLock().unlock();
            HashSet<aaae> hashSet = new HashSet<>();
            for (Map.Entry entry : hashMap.entrySet()) {
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    aaae aaae = (aaae) entry.getKey();
                    set.add(aaae);
                    if (aaae.a() > 4) {
                        hashSet.add(aaae);
                    }
                }
            }
            for (aaae b2 : hashSet) {
                set.remove(b2.b());
            }
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.c.writeLock().lock();
        try {
            this.b = null;
        } finally {
            this.c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean a(List list, Queue queue, byte[] bArr, byte[] bArr2, boolean z) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return false;
        }
        TreeSet treeSet = new TreeSet(new aaad());
        if (!z) {
            try {
                a(treeSet);
            } catch (OutOfMemoryError e2) {
                return false;
            }
        }
        if (queue != null) {
            Iterator it = treeSet.iterator();
            int i = 0;
            while (it.hasNext() && !queue.isEmpty()) {
                aaae aaae = (aaae) it.next();
                if (i == ((Integer) queue.peek()).intValue()) {
                    it.remove();
                    queue.remove();
                }
                i++;
            }
        }
        if (list != null && !list.isEmpty()) {
            try {
                treeSet.addAll(list);
            } catch (OutOfMemoryError e3) {
                return false;
            }
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Iterator it2 = treeSet.iterator();
            while (it2.hasNext()) {
                instance.update(((aaae) it2.next()).a);
            }
            if (!Arrays.equals(instance.digest(), bArr)) {
                return false;
            }
            aaai aaai = new aaai(this.f, treeSet);
            HashMap hashMap = new HashMap();
            Iterator it3 = treeSet.iterator();
            while (it3.hasNext()) {
                aaae aaae2 = (aaae) it3.next();
                if (aaae2.a() != 4) {
                    hashMap.put(aaae2, (Object) null);
                    aaae b2 = aaae2.b();
                    if (hashMap.containsKey(b2)) {
                        List list2 = (List) hashMap.get(b2);
                        if (list2 == null) {
                            return false;
                        }
                        list2.add(aaae2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aaae2);
                        hashMap.put(b2, arrayList);
                    }
                }
            }
            treeSet.clear();
            this.c.writeLock().lock();
            try {
                this.a.clear();
                this.a = hashMap;
                this.b = aaai;
                this.d = bArr;
                this.e = bArr2;
                this.c.writeLock().unlock();
                return true;
            } catch (Throwable th) {
                this.c.writeLock().unlock();
                throw th;
            }
        } catch (NoSuchAlgorithmException e4) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        this.c.readLock().lock();
        try {
            return this.e;
        } finally {
            this.c.readLock().unlock();
        }
    }
}

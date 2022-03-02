package defpackage;

import android.util.SparseArray;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: qkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkb implements qka {
    private static final Comparator h = aooo.b;
    final qew a;
    final qew b;
    final qew c;
    final qew d;
    final qew e;
    final qew f;
    public qjt g;
    private final qfn i = new qfn("HashPrefixDataStore");
    private final qgy j;

    public qkb(qgy qgy, qex qex) {
        this.j = qgy;
        this.d = qex.b("HashPrefixFilterImpl.IncrementalDigestWithoutDomainsMissing");
        this.e = qex.b("HashPrefixFilterImpl.IncrementalExtraDigestWithoutDomainsExists");
        this.f = qex.b("HashPrefixFilterImpl.IncrementalDigestWithoutDomainsMismatchesFound");
        this.a = qex.b("HashPrefixFilterImpl.IncrementalDigestWithDomainsMissing");
        this.b = qex.b("HashPrefixFilterImpl.IncrementalExtraDigestWithDomainsExists");
        this.c = qex.b("HashPrefixFilterImpl.IncrementalDigestWithDomainsMismatchesFound");
    }

    private static final Set a(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(qlp.a(qjz.b((String) it.next()))));
        }
        return hashSet;
    }

    private static final SparseArray b(Collection collection) {
        SparseArray sparseArray = new SparseArray(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int a2 = qlp.a(qjz.b(str));
            List list = (List) sparseArray.get(a2);
            if (list == null) {
                list = new ArrayList();
                sparseArray.put(a2, list);
            }
            list.add(str);
        }
        return sparseArray;
    }

    private static final void a(WriteBatch writeBatch, byte[] bArr, Collection collection) {
        aucd o = qji.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        qji qji = (qji) o.b;
        if (!qji.a.a()) {
            qji.a = aucj.a(qji.a);
        }
        auab.a((Iterable) collection, (List) qji.a);
        writeBatch.put(bArr, ((qji) o.i()).k());
    }

    static byte[] b(int i2) {
        return ByteBuffer.allocate(4).putInt(i2).array();
    }

    public final void b(Collection collection, Collection collection2) {
        Set a2 = a(collection);
        ob obVar = new ob();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((Integer) it.next()).intValue());
            if (!a2.contains(valueOf)) {
                obVar.add(valueOf);
            }
        }
        a(collection, amzy.h(), amzy.h(), obVar);
    }

    private static final void a(qew qew, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            qew.a();
        }
    }

    public final amri a(int i2) {
        if (this.j.a()) {
            byte[] a2 = this.j.a(b(i2));
            return a2 != null ? amri.b(a(a2)) : ampu.a;
        }
        throw new IOException("Hash Prefix dataStore was null!");
    }

    /* access modifiers changed from: package-private */
    public final Set a(byte[] bArr) {
        try {
            return new ob((Collection) ((qji) aucj.a((aucj) qji.b, bArr, aubs.b())).a);
        } catch (auda e2) {
            this.i.a(e2, "Failed to parse the domain list!", new Object[0]);
            return anfv.a;
        }
    }

    public final void a(PrintWriter printWriter) {
        if (!this.j.a()) {
            printWriter.printf("\t\tHashPrefixDatastore initialization failed!\n", new Object[0]);
        } else if (this.g == null) {
            printWriter.printf("\t\tDomainFilter registration failed!\n", new Object[0]);
        } else {
            qgw c2 = this.j.c();
            try {
                c2.c();
                int i2 = 0;
                while (c2.e()) {
                    i2++;
                    c2.d();
                }
                printWriter.printf("\t\tHash prefix count: %d\n", new Object[]{Integer.valueOf(i2)});
            } catch (Exception e2) {
                printWriter.printf("\t\tHash prefix count failed.\n", new Object[0]);
            } catch (Throwable th) {
                c2.close();
                throw th;
            }
            c2.close();
        }
    }

    public final void a(Collection collection, Collection collection2) {
        if (!jkr.e() && !axvw.b()) {
            return;
        }
        if (this.j.a()) {
            SparseArray b2 = b(collection);
            TreeSet treeSet = new TreeSet(h);
            qgw c2 = this.j.c();
            try {
                c2.c();
                while (c2.e()) {
                    treeSet.add(c2.a());
                    c2.d();
                }
                if (c2 != null) {
                    c2.close();
                }
                WriteBatch create = WriteBatch.create();
                try {
                    int size = b2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] b3 = b(b2.keyAt(i2));
                        a(create, b3, (Collection) b2.valueAt(i2));
                        treeSet.remove(b3);
                    }
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        byte[] b4 = b(((Integer) it.next()).intValue());
                        a(create, b4, amzy.h());
                        treeSet.remove(b4);
                    }
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        create.delete((byte[]) it2.next());
                    }
                    this.j.a(create);
                    create.close();
                    return;
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
        throw th;
    }

    public final void a(Collection collection, Collection collection2, Collection collection3, Collection collection4) {
        if (!jkr.e() && !axvw.b()) {
            return;
        }
        if (this.j.a()) {
            SparseArray b2 = b(collection);
            Set<Integer> a2 = a(collection2);
            WriteBatch create = WriteBatch.create();
            try {
                for (Integer intValue : a2) {
                    create.delete(b(intValue.intValue()));
                }
                Iterator it = collection4.iterator();
                while (it.hasNext()) {
                    create.delete(b(((Integer) it.next()).intValue()));
                }
                int size = b2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(create, b(b2.keyAt(i2)), (Collection) b2.valueAt(i2));
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    a(create, b(((Integer) it2.next()).intValue()), amzy.h());
                }
                this.j.a(create);
                create.close();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
    }

    public final void a(Collection collection, Collection collection2, Collection collection3, Collection collection4, Collection collection5, Collection collection6) {
        if (!jkr.e() && !axvw.b()) {
            return;
        }
        if (this.j.a()) {
            HashSet hashSet = new HashSet(collection4);
            Set a2 = a(collection);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            qgw c2 = this.j.c();
            try {
                c2.c();
                while (c2.e()) {
                    int i2 = ByteBuffer.wrap(c2.a()).getInt();
                    if (!a(c2.b()).isEmpty()) {
                        hashSet3.add(Integer.valueOf(i2));
                    } else {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                    c2.d();
                }
                if (c2 != null) {
                    c2.close();
                }
                hashSet2.removeAll(collection6);
                hashSet2.addAll(collection5);
                hashSet3.removeAll(a(collection3));
                hashSet3.addAll(a(collection2));
                int size = iko.b(hashSet, hashSet2).size();
                int size2 = iko.b(hashSet2, hashSet).size();
                a(this.d, size);
                a(this.e, size2);
                if (size > 0 || size2 > 0) {
                    this.f.a();
                }
                int size3 = iko.b(a2, hashSet3).size();
                int size4 = iko.b(hashSet3, a2).size();
                a(this.a, size3);
                a(this.b, size4);
                if (size3 > 0 || size4 > 0) {
                    this.c.a();
                }
                a(collection, collection4);
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
    }
}

package defpackage;

import android.content.Context;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: thi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class thi {
    public boolean a = false;
    private LevelDb b;
    private final Context c;
    private final String d;
    private final String e;
    private final arwg f;

    public thi(Context context, String str, String str2) {
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = (arwg) thl.a(context, arwg.class);
    }

    private static File a(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getPath(), str2);
    }

    private static void b(Context context, String str, String str2) {
        try {
            LevelDb.destroy(a(context, str, str2));
        } catch (LevelDbException e2) {
            ((anih) ((anih) tgb.a.b()).a("thi", "b", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete DB, folder=%s, file=%s", (Object) str, (Object) str2);
        }
    }

    private final boolean e() {
        if (this.a) {
            ((anih) ((anih) tgb.a.b()).a("thi", "e", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DB is explicitly closed.");
            return false;
        } else if (this.b != null) {
            return true;
        } else {
            try {
                this.b = LevelDb.open(a(this.c, this.d, this.e));
                return true;
            } catch (LevelDbException e2) {
                anih anih = (anih) tgb.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("thi", "e", 61, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create on disk store, folder=%s, file=%s", (Object) this.d, (Object) this.e);
                return false;
            } catch (UnsatisfiedLinkError e3) {
                anih anih2 = (anih) tgb.a.b();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("thi", "e", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("LevelDb wasn't able to use native methods");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public abstract Object a(byte[] bArr);

    /* access modifiers changed from: protected */
    public abstract boolean a(Object obj);

    /* access modifiers changed from: protected */
    public abstract String b(Object obj);

    public final void c() {
        this.f.b();
        LevelDb levelDb = this.b;
        if (levelDb != null) {
            levelDb.close();
            this.b = null;
        }
        Context context = this.c;
        String str = this.d;
        String str2 = this.e;
        try {
            LevelDb.destroy(a(context, str, str2));
        } catch (LevelDbException e2) {
            ((anih) ((anih) tgb.a.b()).a("thi", "b", 85, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete DB, folder=%s, file=%s", (Object) str, (Object) str2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract byte[] c(Object obj);

    public final List d() {
        this.f.b();
        if (!e()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            LevelDb.Iterator it = this.b.iterator();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    byte[] bArr = this.b.get(it.key());
                    if (bArr != null) {
                        Object a2 = a(bArr);
                        if (a2 != null) {
                            if (a(a2)) {
                                arrayList2.add(a2);
                            } else {
                                arrayList.add(a2);
                            }
                        }
                    }
                    it.next();
                }
            } catch (OutOfMemoryError e2) {
                anih anih = (anih) tgb.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("thi", "d", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get all data, returning partial results");
            } catch (Throwable th) {
                if (it != null) {
                    it.close();
                }
                throw th;
            }
            if (it != null) {
                it.close();
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i));
            }
            return arrayList;
        } catch (LevelDbException e3) {
            c();
            anih anih2 = (anih) tgb.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("thi", "d", 221, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get all data");
            return Collections.emptyList();
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }

    public final Object a(String str) {
        this.f.b();
        if (str == null) {
            ((anih) ((anih) tgb.a.b()).a("thi", "a", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("get(id) given null for DB=%s", (Object) this.e);
            return null;
        }
        if (e()) {
            try {
                byte[] bArr = this.b.get(str.getBytes());
                if (bArr != null) {
                    return a(bArr);
                }
            } catch (LevelDbCorruptionException e2) {
                anih anih = (anih) tgb.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("thi", "a", 145, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get proto with ID=%s", (Object) str);
                c();
            } catch (LevelDbException e3) {
                anih anih2 = (anih) tgb.a.b();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("thi", "a", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get proto with ID=%s", (Object) str);
            }
        }
        return null;
    }

    public final void b() {
        LevelDb levelDb = this.b;
        if (levelDb != null) {
            levelDb.close();
            this.b = null;
            this.a = true;
        }
    }

    public final boolean b(String str) {
        this.f.b();
        if (!e()) {
            return false;
        }
        try {
            this.b.delete(str.getBytes());
            return true;
        } catch (LevelDbCorruptionException e2) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("thi", "b", 169, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete proto with ID=%s", (Object) str);
            c();
            return false;
        } catch (LevelDbException e3) {
            anih anih2 = (anih) tgb.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("thi", "b", 172, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to delete proto with ID=%s", (Object) str);
            return false;
        }
    }

    public final void e(Object obj) {
        a(b(obj), obj);
    }

    public final boolean a(String str, Object obj) {
        this.f.b();
        if (str == null || obj == null) {
            ((anih) ((anih) tgb.a.b()).a("thi", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ID and object cannot be null. id=%s, object=%s", (Object) str, obj);
            return false;
        } else if (!e()) {
            return false;
        } else {
            try {
                this.b.put(str.getBytes(), c(obj));
                return true;
            } catch (LevelDbCorruptionException e2) {
                anih anih = (anih) tgb.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("thi", "a", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save proto with ID=%s, object=%s", (Object) str, obj);
                c();
                return false;
            } catch (LevelDbException e3) {
                anih anih2 = (anih) tgb.a.b();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("thi", "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save proto with ID=%s, object=%s", (Object) str, obj);
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean d(Object obj) {
        return b(b(obj));
    }
}

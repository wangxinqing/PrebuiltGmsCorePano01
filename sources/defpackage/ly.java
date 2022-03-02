package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ly {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long a(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    private static Object a(Object[] objArr, int i, lx lxVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(lxVar.b(obj2) - i2);
            int i4 = abs + abs + (lxVar.a(obj2) == z ? 0 : 1);
            if (obj == null || i3 > i4) {
                obj = obj2;
                i3 = i4;
            }
        }
        return obj;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = lz.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (lz.a(a2, resources, i)) {
                Typeface createFromFile = Typeface.createFromFile(a2.getPath());
                a2.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a2.delete();
            throw th;
        }
        a2.delete();
        return null;
    }

    /* access modifiers changed from: protected */
    public Typeface a(Context context, InputStream inputStream) {
        File a2 = lz.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (lz.a(a2, inputStream)) {
                Typeface createFromFile = Typeface.createFromFile(a2.getPath());
                a2.delete();
                return createFromFile;
            }
        } catch (RuntimeException e) {
        } catch (Throwable th) {
            a2.delete();
            throw th;
        }
        a2.delete();
        return null;
    }

    public Typeface a(Context context, kx kxVar, Resources resources, int i) {
        ky kyVar = (ky) a((Object[]) kxVar.a, i, (lx) new lw());
        if (kyVar == null) {
            return null;
        }
        Typeface a2 = lp.a(context, resources, kyVar.f, kyVar.a, i);
        long a3 = a(a2);
        if (a3 != 0) {
            this.a.put(Long.valueOf(a3), kxVar);
        }
        return a2;
    }

    public Typeface a(Context context, nc[] ncVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (ncVarArr.length > 0) {
            try {
                inputStream = context.getContentResolver().openInputStream(a(ncVarArr, i).a);
                try {
                    Typeface a2 = a(context, inputStream);
                    lz.a((Closeable) inputStream);
                    return a2;
                } catch (IOException e) {
                    lz.a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    lz.a((Closeable) inputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                inputStream = null;
                lz.a((Closeable) inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                lz.a((Closeable) inputStream2);
                throw th;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public nc a(nc[] ncVarArr, int i) {
        return (nc) a((Object[]) ncVarArr, i, (lx) new lv());
    }
}

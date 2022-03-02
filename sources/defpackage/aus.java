package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: aus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aus {
    public static final Map a = new HashMap();

    private static avi a(bat bat, String str, boolean z) {
        try {
            auk a2 = baa.a(bat);
            if (str != null) {
                axk.a.a(str, a2);
            }
            avi avi = new avi((Object) a2);
            if (z) {
                bbb.a((Closeable) bat);
            }
            return avi;
        } catch (Exception e) {
            avi avi2 = new avi((Throwable) e);
            if (z) {
                bbb.a((Closeable) bat);
            }
            return avi2;
        } catch (Throwable th) {
            if (z) {
                bbb.a((Closeable) bat);
            }
            throw th;
        }
    }

    public static avi b(Context context, int i) {
        try {
            return a(context.getResources().openRawResource(i), c(context, i));
        } catch (Resources.NotFoundException e) {
            return new avi((Throwable) e);
        }
    }

    public static avi c(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            if (str.endsWith(".zip")) {
                return a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return a(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new avi((Throwable) e);
        }
    }

    public static avl b(Context context, String str) {
        return a(str, (Callable) new auo(context.getApplicationContext(), str));
    }

    private static String c(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static avi a(InputStream inputStream, String str) {
        try {
            return a(bat.a(batq.a(batq.a(inputStream))), str, true);
        } finally {
            bbb.a((Closeable) inputStream);
        }
    }

    public static avi a(ZipInputStream zipInputStream, String str) {
        avi avi;
        avd avd;
        try {
            HashMap hashMap = new HashMap();
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    obj = a(bat.a(batq.a(batq.a((InputStream) zipInputStream))), (String) null, false).a;
                } else if (!name.contains(".png") && !name.contains(".webp")) {
                    zipInputStream.closeEntry();
                } else {
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                avi = new avi((Throwable) new IllegalArgumentException("Unable to parse composition"));
            } else {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Iterator it = ((auk) obj).b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            avd = null;
                            break;
                        }
                        avd = (avd) it.next();
                        if (avd.d.equals(str2)) {
                            break;
                        }
                    }
                    if (avd != null) {
                        avd.e = bbb.a((Bitmap) entry.getValue(), avd.a, avd.b);
                    }
                }
                Iterator it2 = ((auk) obj).b.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (((avd) entry2.getValue()).e == null) {
                            avi = new avi((Throwable) new IllegalStateException("There is no image for " + ((avd) entry2.getValue()).d));
                            break;
                        }
                    } else {
                        if (str != null) {
                            axk.a.a(str, (auk) obj);
                        }
                        avi = new avi(obj);
                    }
                }
            }
        } catch (IOException e) {
            avi = new avi((Throwable) e);
        } catch (Throwable th) {
            bbb.a((Closeable) zipInputStream);
            throw th;
        }
        bbb.a((Closeable) zipInputStream);
        return avi;
    }

    public static avl a(Context context, int i) {
        return a(c(context, i), (Callable) new aup(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static avl a(Context context, String str) {
        return a("url_" + str, (Callable) new aun(context, str));
    }

    public static avl a(InputStream inputStream) {
        return a((String) null, (Callable) new auq(inputStream));
    }

    private static avl a(String str, Callable callable) {
        auk auk;
        if (str != null) {
            auk = (auk) axk.a.b.a((Object) str);
        } else {
            auk = null;
        }
        if (auk != null) {
            return new avl(new aur(auk));
        }
        if (str != null && a.containsKey(str)) {
            return (avl) a.get(str);
        }
        avl avl = new avl(callable);
        avl.b(new aul(str));
        avl.a((ave) new aum(str));
        a.put(str, avl);
        return avl;
    }
}

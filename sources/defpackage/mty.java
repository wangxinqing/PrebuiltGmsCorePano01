package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mty {
    private static amri a(Slice slice, String str) {
        for (SliceItem sliceItem : slice.c()) {
            if (sliceItem.b.equals("text") && ((TextUtils.isEmpty(str) && sliceItem.a().isEmpty()) || (!TextUtils.isEmpty(str) && sliceItem.a(str)))) {
                return amri.b(sliceItem.b());
            }
        }
        return ampu.a;
    }

    private static mtx b(Slice slice) {
        amri c = c(slice);
        amri a = a(slice, (String) null);
        amri d = d(slice);
        if (!c.a() || !a.a() || !d.a()) {
            ((anih) ((anih) mte.a.c()).a("mty", "b", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: addRowFromSliceListItem fail, title=%s, subtitle=%s, action=%s", (Object) c.toString(), (Object) a.toString(), (Object) d.toString());
            return null;
        }
        mtw mtw = new mtw();
        PendingIntent a2 = ((aop) d.b()).a.a();
        if (a2 != null) {
            mtw.d = a2;
            IconCompat a3 = ((aop) d.b()).a();
            if (a3 != null) {
                mtw.c = a3;
                String charSequence = ((CharSequence) c.b()).toString();
                if (charSequence != null) {
                    mtw.a = charSequence;
                    String charSequence2 = ((CharSequence) a.b()).toString();
                    if (charSequence2 != null) {
                        mtw.b = charSequence2;
                        String str = mtw.a == null ? " title" : "";
                        if (mtw.b == null) {
                            str = str.concat(" subtitle");
                        }
                        if (mtw.c == null) {
                            str = String.valueOf(str).concat(" icon");
                        }
                        if (mtw.d == null) {
                            str = String.valueOf(str).concat(" pendingIntent");
                        }
                        if (str.isEmpty()) {
                            return new mtt(mtw.a, mtw.b, mtw.c, mtw.d);
                        }
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null icon");
        }
        throw new NullPointerException("Null pendingIntent");
    }

    private static amri c(Slice slice) {
        return a(slice, "title");
    }

    private static amri d(Slice slice) {
        amri amri;
        for (SliceItem sliceItem : slice.c()) {
            if (sliceItem.b.equals("slice")) {
                if (sliceItem.a("title")) {
                    amri d = d(sliceItem.f());
                    if (d.a()) {
                        return d;
                    }
                } else {
                    continue;
                }
            } else if (sliceItem.b.equals("action")) {
                Iterator it = sliceItem.f().c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        amri = ampu.a;
                        break;
                    }
                    SliceItem sliceItem2 = (SliceItem) it.next();
                    if (sliceItem2.b.equals("image")) {
                        amri = amri.b(sliceItem2.c());
                        break;
                    }
                }
                amri c = c(sliceItem.f());
                if (amri.a()) {
                    return amri.b(aop.a(sliceItem.d(), (IconCompat) amri.b(), 0, (CharSequence) c.a((Object) "")));
                }
            } else {
                continue;
            }
        }
        return ampu.a;
    }

    public static ArrayList a(Slice slice) {
        ArrayList arrayList = new ArrayList();
        if (slice != null) {
            for (SliceItem sliceItem : slice.c()) {
                if (sliceItem.b.equals("slice") && sliceItem.a("list_item")) {
                    Slice f = sliceItem.f();
                    amri c = c(f);
                    mtt mtt = null;
                    amri a = a(f, (String) null);
                    amri d = d(f);
                    if (!c.a() || !a.a() || !d.a()) {
                        ((anih) ((anih) mte.a.c()).a("mty", "b", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: addRowFromSliceListItem fail, title=%s, subtitle=%s, action=%s", (Object) c.toString(), (Object) a.toString(), (Object) d.toString());
                    } else {
                        mtw mtw = new mtw();
                        PendingIntent a2 = ((aop) d.b()).a.a();
                        if (a2 != null) {
                            mtw.d = a2;
                            IconCompat a3 = ((aop) d.b()).a();
                            if (a3 != null) {
                                mtw.c = a3;
                                String charSequence = ((CharSequence) c.b()).toString();
                                if (charSequence != null) {
                                    mtw.a = charSequence;
                                    String charSequence2 = ((CharSequence) a.b()).toString();
                                    if (charSequence2 != null) {
                                        mtw.b = charSequence2;
                                        String str = mtw.a == null ? " title" : "";
                                        if (mtw.b == null) {
                                            str = str.concat(" subtitle");
                                        }
                                        if (mtw.c == null) {
                                            str = String.valueOf(str).concat(" icon");
                                        }
                                        if (mtw.d == null) {
                                            str = String.valueOf(str).concat(" pendingIntent");
                                        }
                                        if (str.isEmpty()) {
                                            mtt = new mtt(mtw.a, mtw.b, mtw.c, mtw.d);
                                        } else {
                                            String valueOf = String.valueOf(str);
                                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                        }
                                    } else {
                                        throw new NullPointerException("Null subtitle");
                                    }
                                } else {
                                    throw new NullPointerException("Null title");
                                }
                            } else {
                                throw new NullPointerException("Null icon");
                            }
                        } else {
                            throw new NullPointerException("Null pendingIntent");
                        }
                    }
                    if (mtt != null) {
                        arrayList.add(mtt);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList a(aoe aoe, Uri uri) {
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mtv mtv = new mtv(atomicReference, countDownLatch, aoe, uri);
        aoe.a(uri, mtv);
        try {
            mtv.a(aoe.c(uri));
            countDownLatch.await(aymt.a.a().aW(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | InterruptedException e) {
            anih anih = (anih) mte.a.c();
            anih.a(e);
            ((anih) anih.a("mty", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error waiting for slice binding for uri %s", (Object) uri.toString());
            aoe.b(uri, mtv);
        }
        return a((Slice) atomicReference.get());
    }
}

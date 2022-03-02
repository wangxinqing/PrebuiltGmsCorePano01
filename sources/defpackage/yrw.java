package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.R;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: yrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrw {
    private static final Uri a = ive.a("default_avatar");

    private static Uri a(zco zco) {
        return (zco == null || zco.c() == null) ? a : ytz.a(zco.c());
    }

    public static ysx a(Context context, String str, boolean z, String str2, zcr zcr, String str3, String str4, String str5) {
        List list;
        int i;
        int i2;
        Uri uri;
        int i3;
        int i4;
        Uri uri2;
        Uri uri3;
        int i5;
        String str6;
        String str7;
        String str8;
        zcp b;
        List c;
        zcp b2;
        Uri uri4;
        boolean a2 = a(zcr);
        zcq e = zcr.e();
        if (e == null) {
            list = Collections.emptyList();
        } else {
            zcp b3 = e.b();
            if (b3 == null) {
                list = Collections.emptyList();
            } else {
                list = b3.c();
                if (list == null) {
                    list = Collections.emptyList();
                }
            }
        }
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        Uri[] uriArr = new Uri[4];
        if (!a2) {
            if (i > 0) {
                uri4 = a((zco) list.get(0));
                i2 = 1;
            } else {
                uri4 = null;
                i2 = 0;
            }
            uriArr[0] = uri4;
        } else {
            uriArr[0] = str5 != null ? ytz.a(str5) : a;
            i2 = 0;
        }
        if (i > i2) {
            i3 = i2 + 1;
            uri = a((zco) list.get(i2));
        } else {
            i3 = i2;
            uri = null;
        }
        uriArr[1] = uri;
        if (i > i3) {
            i4 = i3 + 1;
            uri2 = a((zco) list.get(i3));
        } else {
            i4 = i3;
            uri2 = null;
        }
        uriArr[2] = uri2;
        if (i > i4) {
            uri3 = a((zco) list.get(i4));
        } else {
            uri3 = null;
        }
        char c2 = 3;
        uriArr[3] = uri3;
        Resources resources = context.getResources();
        Locale locale = resources.getConfiguration().locale;
        zcq e2 = zcr.e();
        if (e2 == null || (b2 = e2.b()) == null) {
            i5 = 0;
        } else {
            i5 = (int) b2.b();
        }
        ArrayList arrayList = new ArrayList();
        zcq e3 = zcr.e();
        if (!(e3 == null || (b = e3.b()) == null || (c = b.c()) == null)) {
            int i6 = 0;
            while (i6 < c.size() && i6 < 4) {
                arrayList.add(((zco) c.get(i6)).b().split(" ")[0]);
                i6++;
            }
        }
        int min = Math.min(arrayList.size(), true - (a2 ? 1 : 0));
        yry yry = new yry();
        if (a2 || !arrayList.isEmpty()) {
            int size = a2 + arrayList.size();
            if (i5 < size) {
                i5 = size;
            }
            yry.d = yrz.a(resources, locale, i5);
            if (!a2) {
                str7 = null;
            } else if (i5 == 1) {
                yry.a = resources.getString(R.string.plus_one_social_annotation_suffix, new Object[]{resources.getString(R.string.plus_one_social_annotation_user)});
                yry.b = resources.getString(R.string.plus_one_social_annotation_user);
            } else {
                str7 = resources.getString(R.string.plus_one_social_annotation_prefix_you, new Object[]{resources.getString(R.string.plus_one_social_annotation_user)});
            }
            int i7 = 0;
            while (i7 < min) {
                String str9 = (String) arrayList.get(i7);
                if (str7 == null) {
                    str8 = resources.getString(R.string.plus_one_social_annotation_prefix, new Object[]{str9});
                } else {
                    str8 = resources.getString(R.string.plus_one_social_annotation_separator, new Object[]{str7, str9});
                }
                str7 = str8;
                i7++;
                c2 = 3;
            }
            Integer valueOf = Integer.valueOf(i5);
            yry.a = resources.getString(R.string.plus_one_annotation_count_prefix, new Object[]{valueOf, str7});
            yry.b = resources.getString(R.string.plus_one_annotation_count_only, new Object[]{valueOf});
        } else {
            yry.d = yrz.a(resources, locale, i5);
            if (i5 == 0) {
                yry.a = resources.getString(R.string.plus_one_annotation_none);
                yry.b = resources.getString(R.string.plus_one_annotation_none_short);
            } else {
                Integer valueOf2 = Integer.valueOf(i5);
                yry.a = resources.getString(R.string.plus_one_annotation_count_prefix, new Object[]{valueOf2, resources.getString(R.string.plus_one_annotation_none)});
                yry.b = resources.getString(R.string.plus_one_annotation_count_prefix, new Object[]{valueOf2, resources.getString(R.string.plus_one_annotation_none_short)});
                yry.c = resources.getString(R.string.plus_one_annotation_count_only, new Object[]{valueOf2});
            }
        }
        String[] strArr = new String[4];
        strArr[0] = yry.a;
        strArr[1] = yry.b;
        strArr[2] = yry.c;
        strArr[c2] = yry.d;
        String b4 = zcr.b();
        if (!a2) {
            str6 = "com.google.android.gms.plus.action.PLUS_ONE";
        } else {
            str6 = "com.google.android.gms.plus.action.UNDO_PLUS_ONE";
        }
        return new ysx(str2, a2, yry.d, strArr, uriArr, new Intent(str6).setClassName(context, "com.google.android.gms.plus.plusone.PlusOneActivity").putExtra("com.google.android.gms.plus.intent.extra.ACCOUNT", str).putExtra("com.google.android.gms.plus.intent.extra.EXTRA_SIGNED_UP", z).putExtra("com.google.android.gms.plus.intent.extra.TOKEN", b4).putExtra("com.google.android.gms.plus.intent.extra.URL", str2), b4, str3, str4);
    }

    static void a(PlusonesEntity plusonesEntity, int i) {
        PlusonesEntity.MetadataEntity.GlobalCountsEntity globalCountsEntity;
        PlusonesEntity.MetadataEntity metadataEntity = plusonesEntity.g;
        if (metadataEntity != null && (globalCountsEntity = metadataEntity.e) != null) {
            FastJsonResponse$Field d = FastJsonResponse$Field.d("count", 2);
            double d2 = globalCountsEntity.c;
            double d3 = (double) i;
            Double.isNaN(d3);
            globalCountsEntity.a(d, d2 + d3);
        }
    }

    static void a(PlusonesEntity plusonesEntity, boolean z) {
        plusonesEntity.a(FastJsonResponse$Field.e("isSetByViewer", 5), z);
    }

    public static boolean a(zcr zcr) {
        return zcr.d() && zcr.c();
    }

    public static boolean a(zcx zcx) {
        Boolean asBoolean = zcx.a.getAsBoolean("isSetByViewer");
        if (asBoolean != null) {
            return asBoolean.booleanValue();
        }
        return false;
    }
}

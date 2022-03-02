package defpackage;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: kyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyp {
    private static final ith a = new ith("MetadataChangeValidator", "");

    static void a(MetadataBundle metadataBundle) {
        String str = (String) metadataBundle.a((kyq) lce.Q);
        String str2 = (String) metadataBundle.a(lce.c);
        String str3 = (String) metadataBundle.a((kyq) lce.N);
        if (str != null) {
            a("title", str, ((Integer) jzq.af.c()).intValue());
        }
        if (str2 != null) {
            a("description", str2, ((Integer) jzq.ab.c()).intValue());
        }
        if (str3 != null) {
            a("mimeType", str3, ((Integer) jzq.ad.c()).intValue());
            a("mimeType", str3, (String) jzq.ah.c());
        }
    }

    static void a(MetadataBundle metadataBundle, boolean z) {
        String str = (String) metadataBundle.a(lce.g);
        if (str == null) {
            return;
        }
        if (!z) {
            throw new nja(10, "Cannot set folderColorRgb for non-folders.");
        } else if (!Pattern.compile("^#[A-Fa-f0-9]{6}$").matcher(str).matches()) {
            metadataBundle.b(lce.g, (String) jzq.V.c());
        }
    }

    static void a(String str, String str2, int i) {
        if (str2.codePointCount(0, str2.length()) > i) {
            throw new nja(10, String.format("%s value too large.", new Object[]{str}));
        }
    }

    static void a(String str, String str2, String str3) {
        try {
            if (!Pattern.matches(str3, str2)) {
                throw new nja(10, String.format("Invalid characters in %s value.", new Object[]{str}));
            }
        } catch (PatternSyntaxException e) {
            a.c("MetadataChangeValidator", "Invalid mime type pattern", e);
        }
    }

    static void a(String str, kmp kmp, MetadataBundle metadataBundle) {
        int i;
        int i2;
        long j;
        Map map;
        String str2;
        int i3;
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) metadataBundle.a((kyq) lce.L);
        if (appVisibleCustomProperties != null) {
            if (kmp != null) {
                map = krl.a(kmp.a(str, false));
                j = (long) kmp.a.J;
                i2 = 0;
                i = 0;
                for (krl h : map.values()) {
                    if (!h.h()) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            } else {
                map = Collections.emptyMap();
                j = 0;
                i2 = 0;
                i = 0;
            }
            Iterator it = appVisibleCustomProperties.iterator();
            while (it.hasNext()) {
                CustomProperty customProperty = (CustomProperty) it.next();
                CustomPropertyKey customPropertyKey = customProperty.a;
                String str3 = customPropertyKey.a;
                if (customPropertyKey.b == 1) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                boolean containsKey = map.containsKey(krl.a(str3, str2));
                String str4 = customProperty.b;
                if (containsKey) {
                    i3 = str4 == null ? -1 : 0;
                } else if (str4 != null) {
                    i3 = 1;
                } else {
                    String valueOf = String.valueOf(customProperty.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Cannot delete non-existent property: ");
                    sb.append(valueOf);
                    throw new nja(10, sb.toString());
                }
                if (customProperty.a.b != 1) {
                    i2 += i3;
                } else {
                    i += i3;
                }
                j += (long) i3;
            }
            if (i2 > 30) {
                throw new nja(10, String.format("A resource cannot have more than %d public properties", new Object[]{30}));
            } else if (i > 30) {
                throw new nja(10, String.format("A resource cannot have more than %d private properties", new Object[]{30}));
            } else if (j > 100) {
                throw new nja(10, String.format("A resource cannot have more than %d total properties", new Object[]{100}));
            }
        }
    }

    public static void a(khq khq, MetadataBundle metadataBundle, boolean z) {
        a(khq.b, (kmp) null, metadataBundle);
        a(metadataBundle, z);
        a(metadataBundle);
    }

    public static void a(khq khq, kmp kmp, MetadataBundle metadataBundle) {
        iva.a((Object) kmp);
        if (!metadataBundle.c(lce.F) || kmp.j()) {
            a(khq.b, kmp, metadataBundle);
            a(metadataBundle, kmp.w());
            a((kyq) lce.Q, metadataBundle);
            a((kyq) lce.N, metadataBundle);
            a(metadataBundle);
            return;
        }
        throw new nja(10, "Only owner can update writersCanShare property of a Drive resource");
    }

    static void a(kyq kyq, MetadataBundle metadataBundle) {
        if (metadataBundle.c(kyq) && metadataBundle.a(kyq) == null) {
            throw new nja(10, String.format("%s must not be null", new Object[]{((kyl) kyq).a}));
        }
    }
}

package defpackage;

import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.STSortSpec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: osn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osn {
    public static final osm a = new osk();
    public static final osm b = new osl();
    private static final Pattern c = Pattern.compile("(\\p{Alnum}|[-._/])+");

    private static String a(int i, STSortSpec sTSortSpec) {
        if (sTSortSpec != null && i != 5) {
            return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
        }
        if (sTSortSpec == null && i == 5) {
            return "RankingStrategy.ST_SORT and STSortSpec must be set together.";
        }
        if (i >= 0 && i <= 5) {
            return null;
        }
        return "Invalid ranking strategy.";
    }

    private static String b(int i) {
        if (i < 0 || i > 3) {
            return "Invalid query tokenizer";
        }
        return null;
    }

    private static String c(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 64) {
                return str.length() == 0 ? new String("Query origin too long, max is 64: ") : "Query origin too long, max is 64: ".concat(str);
            }
            if (!c.matcher(str).matches()) {
                return "Incorrect query origin format. Should use following format: [a-zA-Z0-9._-/]+";
            }
        }
        return null;
    }

    public static final String d(String str, String str2, int i) {
        try {
            a(str, str2, i);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r0 = c(r7.m);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.google.android.gms.appdatasearch.QuerySpecification r7) {
        /*
            java.util.List r0 = r7.b
            r1 = 16
            if (r0 != 0) goto L_0x0007
            goto L_0x0029
        L_0x0007:
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0051
            java.util.List r0 = r7.b
            int r2 = r0.size()
            r3 = 0
        L_0x0014:
            if (r3 >= r2) goto L_0x0029
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r6 = "Tag"
            java.lang.String r4 = d(r6, r4, r5)
            int r3 = r3 + 1
            if (r4 == 0) goto L_0x0014
            return r4
        L_0x0029:
            java.util.List r0 = r7.c
            if (r0 != 0) goto L_0x002e
            goto L_0x0037
        L_0x002e:
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x0037
            java.lang.String r7 = "Too many sections requested."
            return r7
        L_0x0037:
            int r0 = r7.h
            java.lang.String r0 = b((int) r0)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = r7.m
            java.lang.String r0 = c(r0)
            if (r0 != 0) goto L_0x0050
            int r0 = r7.f
            com.google.android.gms.appdatasearch.STSortSpec r7 = r7.l
            java.lang.String r7 = a((int) r0, (com.google.android.gms.appdatasearch.STSortSpec) r7)
            return r7
        L_0x0050:
            return r0
        L_0x0051:
            java.lang.String r7 = "Too many tags requested."
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osn.a(com.google.android.gms.appdatasearch.QuerySpecification):java.lang.String");
    }

    public static void b(String str) {
        a("Corpus name", str, 2048);
        if (str.charAt(0) == '.') {
            throw new IllegalArgumentException("Corpus name cannot start with .");
        }
    }

    public static final void b(String str, String str2, int i) {
        a(str, (Object) str2);
        c(str, str2, i);
    }

    public static final void c(String str, String str2, int i) {
        if (str2.length() > i) {
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(" too long (max ");
            sb.append(i);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final String a(RegisterCorpusInfo registerCorpusInfo) {
        try {
            b(registerCorpusInfo.a);
            b("Version tag", registerCorpusInfo.b, 100);
            a("Content provider uri", (Object) registerCorpusInfo.c);
            a("Content provider uri", registerCorpusInfo.c.toString(), 2048);
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.d;
            if (registerSectionInfoArr == null) {
                return "Section information is missing";
            }
            if (registerSectionInfoArr.length > 16) {
                return "Too many sections (max: 16)";
            }
            HashMap hashMap = new HashMap();
            RegisterSectionInfo[] registerSectionInfoArr2 = registerCorpusInfo.d;
            int length = registerSectionInfoArr2.length;
            int i = 0;
            while (i < length) {
                RegisterSectionInfo registerSectionInfo = registerSectionInfoArr2[i];
                if (registerSectionInfo == null) {
                    return "Null section info";
                }
                a(registerSectionInfo.a);
                String str = registerSectionInfo.b;
                if (str != null) {
                    if (!dto.a.contains(str)) {
                        StringBuilder sb = new StringBuilder(str.length() + 22);
                        sb.append("Bad section format: [");
                        sb.append(str);
                        sb.append("]");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if ("blob".equals(registerSectionInfo.b) && !registerSectionInfo.c) {
                    return "Format cannot be indexed";
                }
                a(registerSectionInfo.d);
                String str2 = registerSectionInfo.f;
                if (str2 != null) {
                    if (str2.length() > 24) {
                        throw new IllegalArgumentException(str2.length() == 0 ? new String("Subsection separator string too long, max is 24: ") : "Subsection separator string too long, max is 24: ".concat(str2));
                    }
                }
                if (hashMap.containsKey(registerSectionInfo.a)) {
                    String valueOf = String.valueOf(registerSectionInfo.a);
                    return valueOf.length() == 0 ? new String("Duplicate section name ") : "Duplicate section name ".concat(valueOf);
                }
                hashMap.put(registerSectionInfo.a, registerSectionInfo);
                double b2 = dud.b(registerSectionInfo);
                if (b2 > 0.0d) {
                    if (b2 <= 1.0d) {
                        double c2 = dud.c(registerSectionInfo);
                        if (c2 != 1.0d && !"rfc822".equals(registerSectionInfo.b)) {
                            return "DemoteRfc822Hostname feature only allowed on rfc822 sections.";
                        }
                        if (c2 > 0.0d) {
                            if (c2 <= 1.0d) {
                                if (dud.a(registerSectionInfo)) {
                                    if (!"url".equals(registerSectionInfo.b)) {
                                        return "omniboxUrlSection only allowed on url section";
                                    }
                                }
                                i++;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(58);
                        sb2.append("Bad demote rfc822 hostname factor ");
                        sb2.append(c2);
                        return sb2.toString();
                    }
                }
                StringBuilder sb3 = new StringBuilder(55);
                sb3.append("Bad demote common words factor ");
                sb3.append(b2);
                return sb3.toString();
            }
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public static String a(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification) {
        Collection<CorpusScoringInfo> collection;
        try {
            c("Query", str, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            if (i >= 0) {
                if (i2 > 0) {
                    if (globalSearchQuerySpecification == null) {
                        return null;
                    }
                    Map map = globalSearchQuerySpecification.s;
                    if (map != null) {
                        collection = map.values();
                    } else {
                        collection = Collections.emptyList();
                    }
                    for (CorpusScoringInfo corpusScoringInfo : collection) {
                        if (corpusScoringInfo.a.a != null) {
                            int i3 = corpusScoringInfo.b;
                            if (i3 <= 0 || i3 > 65536) {
                                StringBuilder sb = new StringBuilder(22);
                                sb.append("Bad weight ");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Null package name");
                        }
                    }
                    String a2 = a(globalSearchQuerySpecification.e, globalSearchQuerySpecification.o);
                    if (a2 == null) {
                        String b2 = b(globalSearchQuerySpecification.f);
                        if (b2 == null) {
                            String c2 = c(globalSearchQuerySpecification.p);
                            if (c2 == null) {
                                return null;
                            }
                            throw new IllegalArgumentException(c2);
                        }
                        throw new IllegalArgumentException(b2);
                    }
                    throw new IllegalArgumentException(a2);
                }
            }
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Bad start and num results: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            return sb2.toString();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public static final void a(int i) {
        if (i < 0 || i > 63) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Bad section weight: [");
            sb.append(i);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final void a(String str) {
        try {
            pbm pbm = new pbm(str);
            if (pbm.a() || !pbo.b(pbm.e())) {
                pbm.a("Expected a letter or _");
            }
            pbm.d();
            while (!pbm.a()) {
                if (!pbo.c(pbm.e())) {
                    pbm.a("Invalid character; only letters, digits and _ are allowed");
                }
                pbm.d();
            }
            if (str.length() > 64) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Section name too long, max is 64: ") : "Section name too long, max is 64: ".concat(valueOf));
            }
        } catch (pbk e) {
            String valueOf2 = String.valueOf(e.a());
            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid section name: ") : "Invalid section name: ".concat(valueOf2));
        }
    }

    public static final void a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(str.concat(" null"));
        }
    }

    public static final void a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2)) {
            c(str, str2, i);
            return;
        }
        throw new IllegalArgumentException(str.concat(" empty"));
    }

    public static final void a(String str, byte[] bArr) {
        if (bArr.length > 64000) {
            StringBuilder sb = new StringBuilder(str.length() + 27);
            sb.append(str);
            sb.append(" too long (max 64000)");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: wue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wue {
    public static final Pattern c = Pattern.compile("[^a-zA-Z0-9-￿]+");
    public final Context a;
    public final wtz b;
    public final wuc d;
    private final ContentValues e = new ContentValues();
    private final boolean f;
    private boolean g;
    private boolean h;
    private amsn i;
    private final Set j = new HashSet();
    private final String[] k = new String[3];

    private static String a(String[] strArr) {
        return TextUtils.join("", strArr);
    }

    public static String[] b(String str) {
        return ycm.a(c.split(str));
    }

    public static String c(String str) {
        return c.matcher(wub.a(str)).replaceAll("");
    }

    private final String[] d(String str) {
        int codePointAt;
        String str2 = str;
        if (!this.g && !this.h) {
            return ycm.b;
        }
        char c2 = 4;
        if (str2 != null) {
            int length = str.length();
            int i2 = 0;
            char c3 = 0;
            while (true) {
                if (i2 >= length) {
                    c2 = c3;
                    break;
                }
                codePointAt = Character.codePointAt(str2, i2);
                if (Character.isLetter(codePointAt)) {
                    Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                    if (!Character.UnicodeBlock.BASIC_LATIN.equals(of) && !Character.UnicodeBlock.LATIN_1_SUPPLEMENT.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_A.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_B.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL.equals(of)) {
                        if (!Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B.equals(of) && !Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION.equals(of) && !Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT.equals(of)) {
                            if (!wub.b(of)) {
                                if (wub.a(of)) {
                                    c2 = 5;
                                    break;
                                }
                                c3 = 1;
                            } else {
                                break;
                            }
                        } else {
                            int charCount = i2 + Character.charCount(codePointAt);
                            int length2 = str.length();
                        }
                    } else {
                        c3 = 1;
                    }
                }
                i2 += Character.charCount(codePointAt);
            }
            int charCount2 = i2 + Character.charCount(codePointAt);
            int length22 = str.length();
            while (true) {
                if (charCount2 >= length22) {
                    c2 = 2;
                    break;
                }
                int codePointAt2 = Character.codePointAt(str2, charCount2);
                if (Character.isLetter(codePointAt2)) {
                    Character.UnicodeBlock of2 = Character.UnicodeBlock.of(codePointAt2);
                    if (!wub.b(of2)) {
                        if (wub.a(of2)) {
                            c2 = 5;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                charCount2 += Character.charCount(codePointAt2);
            }
        } else {
            c2 = 0;
        }
        if (c2 == 2) {
            if (this.g) {
                wtt a2 = wtt.a(this.a);
                ArrayList arrayList = new ArrayList();
                if (!a2.c || TextUtils.isEmpty(str)) {
                    return ycm.b;
                }
                int length3 = str.length();
                StringBuilder sb = new StringBuilder();
                int i3 = 1;
                for (int i4 = 0; i4 < length3; i4++) {
                    char charAt = str2.charAt(i4);
                    if (ycm.a(charAt)) {
                        if (sb.length() > 0) {
                            wtt.a(sb, arrayList, i3);
                        }
                    } else if (charAt >= 256) {
                        wts wts = new wts();
                        String ch = Character.toString(charAt);
                        wts.b = ch;
                        if (charAt <= 40959 && charAt >= 19968) {
                            wts.a = 2;
                            wts.c = a2.a[a2.b[charAt - 19968]];
                            if (TextUtils.isEmpty(wts.c)) {
                                wts.a = 3;
                                wts.c = wts.b;
                            }
                        } else {
                            wts.a = 3;
                            wts.c = ch;
                        }
                        int i5 = wts.a;
                        if (i5 == 2) {
                            if (sb.length() > 0) {
                                wtt.a(sb, arrayList, i3);
                            }
                            arrayList.add(wts);
                            i3 = 2;
                        } else {
                            if (i3 != i5 && sb.length() > 0) {
                                wtt.a(sb, arrayList, i3);
                            }
                            i3 = wts.a;
                            sb.append(charAt);
                        }
                    } else {
                        if (i3 != 1 && sb.length() > 0) {
                            wtt.a(sb, arrayList, i3);
                        }
                        sb.append(charAt);
                        i3 = 1;
                    }
                }
                if (sb.length() > 0) {
                    wtt.a(sb, arrayList, i3);
                }
                String[] strArr = new String[arrayList.size()];
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    strArr[i6] = ((wts) arrayList.get(i6)).c;
                }
                return strArr;
            }
        } else if (c2 == 5 && this.h) {
            String[] strArr2 = new String[1];
            wtr.b.setLength(0);
            int length4 = str.length();
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                int codePointAt3 = str2.codePointAt(i7);
                if (!(codePointAt3 == 32 || codePointAt3 == 44 || codePointAt3 == 46)) {
                    if (codePointAt3 < 4352 || ((codePointAt3 > 4370 && codePointAt3 < 12593) || ((codePointAt3 > 12622 && codePointAt3 < 44032) || codePointAt3 > 55203))) {
                        break;
                    }
                    if (codePointAt3 < 44032) {
                        if (codePointAt3 >= 12593) {
                            int i9 = codePointAt3 - 12593;
                            if (i9 >= wtr.a.length) {
                                break;
                            }
                            codePointAt3 = wtr.a[i9];
                            if (codePointAt3 == 0) {
                                break;
                            }
                        }
                    } else {
                        codePointAt3 = ((codePointAt3 - 44032) / 588) + 4352;
                    }
                    wtr.b.appendCodePoint(codePointAt3);
                }
                if (i8 >= length4) {
                    break;
                }
                i7 = i8;
            }
            strArr2[0] = wtr.b.toString();
            return strArr2;
        }
        return ycm.b;
    }

    public wue(wtz wtz, Context context) {
        this.a = context;
        this.b = wtz;
        this.d = new wuc();
        a(Locale.getDefault());
        xip.a();
        boolean booleanValue = Boolean.valueOf(aywy.a.a().bF()).booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            this.i = amsn.b();
        }
    }

    private final void a(wtx wtx, long j2, int i2, String str) {
        this.e.clear();
        this.e.put("person_id", Long.valueOf(j2));
        this.e.put("kind", Integer.valueOf(i2));
        this.e.put("value", str);
        wtx.a("search_index", this.e);
    }

    private final void a(wtx wtx, long j2, Set set, String str) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                return;
            }
        }
        set.add(str);
        a(wtx, j2, 1, wub.a(str));
    }

    public static String[] a(String str) {
        return ycm.a(ycm.d.split(str));
    }

    public final void a(int i2) {
        this.b.b("searchIndexVersion", String.valueOf(i2));
    }

    public final void a(Locale locale) {
        String lowerCase = locale.getLanguage().toLowerCase(Locale.US);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.US);
        boolean z = false;
        if (!Locale.JAPANESE.getLanguage().toLowerCase(Locale.US).equals(lowerCase) && !Locale.KOREAN.getLanguage().toLowerCase(Locale.US).equals(lowerCase) && !Locale.TAIWAN.getCountry().toLowerCase(Locale.US).equals(lowerCase2)) {
            z = true;
        }
        this.g = z;
        this.h = Locale.KOREAN.getLanguage().toLowerCase(Locale.US).equals(lowerCase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wtx r26) {
        /*
            r25 = this;
            r7 = r25
            r0 = r26
            java.lang.String r8 = "PeopleSearchIndexManage"
            java.lang.String r1 = "Rebuilding index..."
            android.util.Log.i(r8, r1)
            android.content.Context r2 = r7.a
            defpackage.wus.a(r2, r8, r1)
            boolean r1 = r7.f
            if (r1 == 0) goto L_0x001e
            amsn r1 = r7.i
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.a((java.util.concurrent.TimeUnit) r2)
            r9 = r1
            goto L_0x0021
        L_0x001e:
            r1 = 0
            r9 = r1
        L_0x0021:
            boolean r1 = r26.g()
            defpackage.iva.a((boolean) r1)
            r11 = 3
            r12 = 1
            java.lang.String r1 = "search_index"
            java.lang.String r2 = "ac_index"
            amzy r1 = defpackage.amzy.a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ SQLException -> 0x037b }
            amzt r2 = defpackage.amzy.j()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ac_people_v2_id"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ac_item_container_person_id"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ac_item_container"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ac_index_1"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "search_person_id_index"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "search_value"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = "ac_index_item_id"
            r2.c(r3)     // Catch:{ SQLException -> 0x037b }
            defpackage.xip.a()     // Catch:{ SQLException -> 0x037b }
            xfs r3 = defpackage.xho.a     // Catch:{ SQLException -> 0x037b }
            java.lang.Object r3 = r3.a()     // Catch:{ SQLException -> 0x037b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ SQLException -> 0x037b }
            boolean r3 = r3.booleanValue()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r4 = "ac_item_affinity_1"
            if (r3 == 0) goto L_0x007f
            xfs r3 = defpackage.xhp.a     // Catch:{ SQLException -> 0x037b }
            java.lang.Object r3 = r3.a()     // Catch:{ SQLException -> 0x037b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ SQLException -> 0x037b }
            boolean r3 = r3.booleanValue()     // Catch:{ SQLException -> 0x037b }
            if (r3 == 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            r2.c(r4)     // Catch:{ SQLException -> 0x037b }
        L_0x007f:
            amzy r2 = r2.a()     // Catch:{ SQLException -> 0x037b }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ SQLException -> 0x037b }
        L_0x0087:
            boolean r5 = r3.hasNext()     // Catch:{ SQLException -> 0x037b }
            if (r5 == 0) goto L_0x009b
            java.lang.Object r5 = r3.next()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = defpackage.wtq.b((java.lang.String) r5)     // Catch:{ SQLException -> 0x037b }
            r0.a((java.lang.String) r5)     // Catch:{ SQLException -> 0x037b }
            goto L_0x0087
        L_0x009b:
            java.util.Iterator r3 = r1.iterator()     // Catch:{ SQLException -> 0x037b }
        L_0x009f:
            boolean r5 = r3.hasNext()     // Catch:{ SQLException -> 0x037b }
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r3.next()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = defpackage.wtq.a((java.lang.String) r5)     // Catch:{ SQLException -> 0x037b }
            r0.a((java.lang.String) r5)     // Catch:{ SQLException -> 0x037b }
            goto L_0x009f
        L_0x00b3:
            anaf r3 = defpackage.wtp.a()     // Catch:{ SQLException -> 0x037b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ SQLException -> 0x037b }
        L_0x00bb:
            boolean r5 = r1.hasNext()     // Catch:{ SQLException -> 0x037b }
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r5 = r1.next()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLException -> 0x037b }
            boolean r6 = r3.containsKey(r5)     // Catch:{ SQLException -> 0x037b }
            if (r6 == 0) goto L_0x00bb
            r3.get(r5)     // Catch:{ SQLException -> 0x037b }
            android.database.sqlite.SQLiteDatabase r6 = r0.b     // Catch:{ SQLException -> 0x037b }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLException -> 0x037b }
            r6.execSQL(r5)     // Catch:{ SQLException -> 0x037b }
            goto L_0x00bb
        L_0x00dc:
            anaf r1 = defpackage.wtp.b()     // Catch:{ SQLException -> 0x037b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SQLException -> 0x037b }
        L_0x00e4:
            boolean r3 = r2.hasNext()     // Catch:{ SQLException -> 0x037b }
            if (r3 == 0) goto L_0x0105
            java.lang.Object r3 = r2.next()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SQLException -> 0x037b }
            boolean r5 = r1.containsKey(r3)     // Catch:{ SQLException -> 0x037b }
            if (r5 == 0) goto L_0x00e4
            r1.get(r3)     // Catch:{ SQLException -> 0x037b }
            android.database.sqlite.SQLiteDatabase r5 = r0.b     // Catch:{ SQLException -> 0x037b }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SQLException -> 0x037b }
            r5.execSQL(r3)     // Catch:{ SQLException -> 0x037b }
            goto L_0x00e4
        L_0x0105:
            xfs r1 = defpackage.xhp.a     // Catch:{ SQLException -> 0x037b }
            java.lang.Object r1 = r1.a()     // Catch:{ SQLException -> 0x037b }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ SQLException -> 0x037b }
            boolean r1 = r1.booleanValue()     // Catch:{ SQLException -> 0x037b }
            if (r1 == 0) goto L_0x011a
            java.lang.String r1 = defpackage.wtq.b((java.lang.String) r4)     // Catch:{ SQLException -> 0x037b }
            r0.a((java.lang.String) r1)     // Catch:{ SQLException -> 0x037b }
        L_0x011a:
            android.database.sqlite.SQLiteDatabase r1 = r0.b     // Catch:{ SQLException -> 0x037b }
            defpackage.wty.e(r1)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r1 = "people"
            java.lang.String[] r2 = defpackage.wud.a     // Catch:{ SQLException -> 0x037b }
            r13 = 0
            android.database.Cursor r14 = r0.a((java.lang.String) r1, (java.lang.String[]) r2, (java.lang.String) r13, (java.lang.String[]) r13)     // Catch:{ SQLException -> 0x037b }
        L_0x0128:
            boolean r1 = r14.isAfterLast()     // Catch:{ all -> 0x0371 }
            r15 = 50
            r6 = 2
            r5 = 0
            if (r1 == 0) goto L_0x018a
            r14.close()     // Catch:{ SQLException -> 0x037b }
            wuc r1 = r7.d     // Catch:{ SQLException -> 0x037b }
            r26.e()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r2 = "PeopleASM"
            java.lang.String r3 = "Rebuilding autocomplete index..."
            android.util.Log.i(r2, r3)     // Catch:{ SQLException -> 0x037b }
            java.lang.String r2 = "SELECT _id FROM ac_people"
            android.database.Cursor r2 = r0.a((java.lang.String) r2, (java.lang.String[]) r13)     // Catch:{ SQLException -> 0x037b }
            r3 = 0
        L_0x0148:
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x0185 }
            if (r4 != 0) goto L_0x0174
            r2.close()     // Catch:{ SQLException -> 0x037b }
            java.lang.String r0 = "Rebuilding index done."
            android.content.Context r1 = r7.a     // Catch:{ SQLException -> 0x037b }
            defpackage.wus.a(r1, r8, r0)     // Catch:{ SQLException -> 0x037b }
            android.util.Log.i(r8, r0)     // Catch:{ SQLException -> 0x037b }
            boolean r0 = r7.f     // Catch:{ SQLException -> 0x037b }
            if (r0 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r12 = 2
        L_0x0161:
            if (r0 == 0) goto L_0x03a0
            amsn r0 = r7.i
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            wml r2 = defpackage.wml.a()
            long r0 = r0 - r9
            r2.a((int) r12, (long) r0)
            return
        L_0x0174:
            long r13 = r2.getLong(r5)     // Catch:{ all -> 0x0185 }
            r1.a(r0, r13)     // Catch:{ all -> 0x0185 }
            int r3 = r3 + r12
            if (r3 <= r15) goto L_0x0184
            r26.i()     // Catch:{ all -> 0x0185 }
            r3 = 0
            goto L_0x0148
        L_0x0184:
            goto L_0x0148
        L_0x0185:
            r0 = move-exception
            r2.close()     // Catch:{ SQLException -> 0x037b }
            throw r0     // Catch:{ SQLException -> 0x037b }
        L_0x018a:
            r3 = 0
        L_0x018b:
            if (r3 >= r15) goto L_0x0366
            boolean r1 = r14.moveToNext()     // Catch:{ all -> 0x0371 }
            if (r1 == 0) goto L_0x0364
            int r1 = r14.getInt(r5)     // Catch:{ all -> 0x0371 }
            long r1 = (long) r1     // Catch:{ all -> 0x0371 }
            java.lang.String r4 = r14.getString(r6)     // Catch:{ all -> 0x0371 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0371 }
            java.lang.String r16 = r14.getString(r12)     // Catch:{ all -> 0x0371 }
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch:{ all -> 0x0371 }
            r13[r5] = r16     // Catch:{ all -> 0x0371 }
            r13[r12] = r4     // Catch:{ all -> 0x0371 }
            java.lang.String r4 = "SELECT name as data, given_name as data2,family_name as data3,middle_name as data4,1 as kind FROM people WHERE owner_id=?1 AND qualified_id=?2 AND name IS NOT NULL UNION SELECT phone as data, NULL as data2,NULL as data3,NULL as data4,3 as kind FROM phones WHERE owner_id=?1 AND qualified_id=?2 UNION SELECT email as data,NULL as data2,NULL as data3,NULL as data4,2 as kind FROM emails WHERE owner_id=?1 AND qualified_id=?2;"
            android.database.Cursor r13 = r0.a((java.lang.String) r4, (java.lang.String[]) r13)     // Catch:{ all -> 0x0371 }
        L_0x01b0:
            boolean r4 = r13.moveToNext()     // Catch:{ all -> 0x035e }
            if (r4 == 0) goto L_0x034b
            java.lang.String r4 = r13.getString(r5)     // Catch:{ all -> 0x035e }
            r15 = 4
            int r15 = r13.getInt(r15)     // Catch:{ all -> 0x035e }
            if (r15 != r12) goto L_0x02c1
            java.lang.String r15 = r13.getString(r12)     // Catch:{ all -> 0x035e }
            java.lang.String r17 = r13.getString(r6)     // Catch:{ all -> 0x035e }
            java.lang.String r18 = r13.getString(r11)     // Catch:{ all -> 0x035e }
            java.lang.String[] r11 = r7.k     // Catch:{ all -> 0x035e }
            r11[r5] = r15     // Catch:{ all -> 0x035e }
            r11[r12] = r17     // Catch:{ all -> 0x035e }
            r11[r6] = r18     // Catch:{ all -> 0x035e }
            java.util.Locale r15 = java.util.Locale.US     // Catch:{ all -> 0x035e }
            java.lang.String r4 = r4.toLowerCase(r15)     // Catch:{ all -> 0x035e }
            java.lang.String r4 = defpackage.ycm.a((java.lang.String) r4)     // Catch:{ all -> 0x035e }
            int r15 = r4.length()     // Catch:{ all -> 0x035e }
            if (r15 == 0) goto L_0x02b5
            java.util.Set r15 = r7.j     // Catch:{ all -> 0x035e }
            r15.clear()     // Catch:{ all -> 0x035e }
            java.util.regex.Pattern r15 = c     // Catch:{ all -> 0x035e }
            java.lang.String[] r4 = r15.split(r4)     // Catch:{ all -> 0x035e }
            java.lang.String r15 = a((java.lang.String[]) r4)     // Catch:{ all -> 0x035e }
            java.util.Set r4 = r7.j     // Catch:{ all -> 0x035e }
            r17 = r1
            r1 = r25
            r2 = r26
            r19 = r3
            r20 = r4
            r3 = r17
            r5 = r20
            r6 = r15
            r1.a((defpackage.wtx) r2, (long) r3, (java.util.Set) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
            java.lang.String[] r1 = r7.d(r15)     // Catch:{ all -> 0x035e }
            int r2 = r1.length     // Catch:{ all -> 0x035e }
            if (r2 <= 0) goto L_0x021e
            java.util.Set r5 = r7.j     // Catch:{ all -> 0x035e }
            java.lang.String r6 = a((java.lang.String[]) r1)     // Catch:{ all -> 0x035e }
            r1 = r25
            r2 = r26
            r3 = r17
            r1.a((defpackage.wtx) r2, (long) r3, (java.util.Set) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
        L_0x021e:
            int r15 = r11.length     // Catch:{ all -> 0x035e }
            r6 = 0
        L_0x0220:
            if (r6 >= r15) goto L_0x02a9
            r1 = r11[r6]     // Catch:{ all -> 0x035e }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x035e }
            if (r2 != 0) goto L_0x02a2
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x035e }
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch:{ all -> 0x035e }
            java.lang.String r1 = defpackage.ycm.a((java.lang.String) r1)     // Catch:{ all -> 0x035e }
            java.lang.String r5 = defpackage.ycm.a((java.lang.String) r1)     // Catch:{ all -> 0x035e }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x035e }
            if (r1 != 0) goto L_0x029f
            java.lang.String[] r3 = r7.d(r5)     // Catch:{ all -> 0x035e }
            int r1 = r3.length     // Catch:{ all -> 0x035e }
            if (r1 > 0) goto L_0x024f
            java.util.regex.Pattern r1 = c     // Catch:{ all -> 0x035e }
            java.lang.String[] r3 = r1.split(r5)     // Catch:{ all -> 0x035e }
            r22 = r6
            r6 = r3
            goto L_0x0268
        L_0x024f:
            java.util.Set r4 = r7.j     // Catch:{ all -> 0x035e }
            r1 = r25
            r2 = r26
            r20 = r3
            r22 = r4
            r3 = r17
            r23 = r5
            r5 = r22
            r22 = r6
            r6 = r23
            r1.a((defpackage.wtx) r2, (long) r3, (java.util.Set) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
            r6 = r20
        L_0x0268:
            int r5 = r6.length     // Catch:{ all -> 0x035e }
            if (r5 <= r12) goto L_0x0285
            java.util.Set r3 = r7.j     // Catch:{ all -> 0x035e }
            java.lang.String r20 = a((java.lang.String[]) r6)     // Catch:{ all -> 0x035e }
            r1 = r25
            r2 = r26
            r23 = r3
            r3 = r17
            r12 = r5
            r5 = r23
            r23 = r6
            r6 = r20
            r1.a((defpackage.wtx) r2, (long) r3, (java.util.Set) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
            r6 = 0
            goto L_0x0289
        L_0x0285:
            r12 = r5
            r23 = r6
            r6 = 0
        L_0x0289:
            if (r6 >= r12) goto L_0x02a4
            r20 = r23[r6]     // Catch:{ all -> 0x035e }
            java.util.Set r5 = r7.j     // Catch:{ all -> 0x035e }
            r1 = r25
            r2 = r26
            r3 = r17
            r24 = r6
            r6 = r20
            r1.a((defpackage.wtx) r2, (long) r3, (java.util.Set) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
            int r6 = r24 + 1
            goto L_0x0289
        L_0x029f:
            r22 = r6
            goto L_0x02a4
        L_0x02a2:
            r22 = r6
        L_0x02a4:
            int r6 = r22 + 1
            r12 = 1
            goto L_0x0220
        L_0x02a9:
            r1 = r17
            r3 = r19
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x02b5:
            r17 = r1
            r19 = r3
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x02c1:
            r17 = r1
            r19 = r3
            r11 = 2
            if (r15 != r11) goto L_0x02fe
            java.lang.String[] r12 = b(r4)     // Catch:{ all -> 0x035e }
            int r15 = r12.length     // Catch:{ all -> 0x035e }
            r6 = 0
        L_0x02ce:
            if (r6 >= r15) goto L_0x02f2
            r1 = r12[r6]     // Catch:{ all -> 0x035e }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x035e }
            if (r2 != 0) goto L_0x02ed
            r5 = 2
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x035e }
            java.lang.String r20 = r1.toLowerCase(r2)     // Catch:{ all -> 0x035e }
            r1 = r25
            r2 = r26
            r3 = r17
            r21 = r6
            r6 = r20
            r1.a((defpackage.wtx) r2, (long) r3, (int) r5, (java.lang.String) r6)     // Catch:{ all -> 0x035e }
            goto L_0x02ef
        L_0x02ed:
            r21 = r6
        L_0x02ef:
            int r6 = r21 + 1
            goto L_0x02ce
        L_0x02f2:
            r1 = r17
            r3 = r19
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x02fe:
            r12 = 3
            if (r15 != r12) goto L_0x033e
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x033c }
            if (r1 != 0) goto L_0x032f
            r15 = 0
            char r1 = r4.charAt(r15)     // Catch:{ all -> 0x033c }
            r2 = 43
            if (r1 != r2) goto L_0x0315
            r1 = 1
            java.lang.String r4 = r4.substring(r1)     // Catch:{ all -> 0x033c }
        L_0x0315:
            r5 = 3
            java.lang.String r6 = android.telephony.PhoneNumberUtils.stripSeparators(r4)     // Catch:{ all -> 0x033c }
            r1 = r25
            r2 = r26
            r3 = r17
            r1.a((defpackage.wtx) r2, (long) r3, (int) r5, (java.lang.String) r6)     // Catch:{ all -> 0x033c }
            r1 = r17
            r3 = r19
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x032f:
            r15 = 0
            r1 = r17
            r3 = r19
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x033c:
            r0 = move-exception
            goto L_0x0360
        L_0x033e:
            r15 = 0
            r1 = r17
            r3 = r19
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r15 = 50
            goto L_0x01b0
        L_0x034b:
            r19 = r3
            r11 = 2
            r12 = 3
            r15 = 0
            r13.close()     // Catch:{ all -> 0x036f }
            int r3 = r19 + 1
            r5 = 0
            r6 = 2
            r11 = 3
            r12 = 1
            r13 = 0
            r15 = 50
            goto L_0x018b
        L_0x035e:
            r0 = move-exception
            r12 = 3
        L_0x0360:
            r13.close()     // Catch:{ all -> 0x036f }
            throw r0     // Catch:{ all -> 0x036f }
        L_0x0364:
            r12 = 3
            goto L_0x0367
        L_0x0366:
            r12 = 3
        L_0x0367:
            r26.i()     // Catch:{ all -> 0x036f }
            r11 = 3
            r12 = 1
            r13 = 0
            goto L_0x0128
        L_0x036f:
            r0 = move-exception
            goto L_0x0373
        L_0x0371:
            r0 = move-exception
            r12 = 3
        L_0x0373:
            r14.close()     // Catch:{ SQLException -> 0x0377 }
            throw r0     // Catch:{ SQLException -> 0x0377 }
        L_0x0377:
            r0 = move-exception
            goto L_0x037d
        L_0x0379:
            r0 = move-exception
            goto L_0x03a1
        L_0x037b:
            r0 = move-exception
            r12 = 3
        L_0x037d:
            java.lang.String r1 = "Error rebuilding search index."
            android.content.Context r2 = r7.a     // Catch:{ all -> 0x0379 }
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r8, (java.lang.String) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0379 }
            android.util.Log.w(r8, r1, r0)     // Catch:{ all -> 0x0379 }
            boolean r0 = r7.f     // Catch:{ all -> 0x0379 }
            if (r0 != 0) goto L_0x038d
            r11 = 1
            goto L_0x038e
        L_0x038d:
            r11 = 3
        L_0x038e:
            if (r0 == 0) goto L_0x03a0
            amsn r0 = r7.i
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.a((java.util.concurrent.TimeUnit) r1)
            wml r2 = defpackage.wml.a()
            long r0 = r0 - r9
            r2.a((int) r11, (long) r0)
        L_0x03a0:
            return
        L_0x03a1:
            boolean r1 = r7.f
            if (r1 == 0) goto L_0x03b6
            amsn r1 = r7.i
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.a((java.util.concurrent.TimeUnit) r2)
            wml r3 = defpackage.wml.a()
            long r1 = r1 - r9
            r4 = 1
            r3.a((int) r4, (long) r1)
        L_0x03b6:
            goto L_0x03b8
        L_0x03b7:
            throw r0
        L_0x03b8:
            goto L_0x03b7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wue.a(wtx):void");
    }
}

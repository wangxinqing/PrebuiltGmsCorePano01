package defpackage;

import android.text.TextUtils;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aps extends apu {
    public SliceItem a;
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public SliceItem d;
    public SliceItem e;
    private SliceItem g;
    private SliceItem h;
    private SliceItem i;
    private SliceItem j;
    private int k;

    /* JADX WARNING: Removed duplicated region for block: B:137:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aps(androidx.slice.SliceItem r12) {
        /*
            r11 = this;
            r11.<init>((androidx.slice.SliceItem) r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.c = r0
            r0 = 0
            r11.k = r0
            boolean r1 = b(r12)
            if (r1 == 0) goto L_0x02ac
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "title"
            r2[r0] = r3
            java.lang.String[] r4 = new java.lang.String[r1]
            r5 = 0
            r4[r0] = r5
            java.util.List r2 = defpackage.apl.a((androidx.slice.SliceItem) r12, (java.lang.String) r5, (java.lang.String[]) r2, (java.lang.String[]) r4)
            int r4 = r2.size()
            java.lang.String r6 = "long"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "action"
            if (r4 <= 0) goto L_0x006e
            java.lang.Object r4 = r2.get(r0)
            androidx.slice.SliceItem r4 = (androidx.slice.SliceItem) r4
            java.lang.String r4 = r4.b
            boolean r9 = r8.equals(r4)
            java.lang.String r10 = "image"
            if (r9 == 0) goto L_0x0052
            java.lang.Object r9 = r2.get(r0)
            androidx.slice.SliceItem r9 = (androidx.slice.SliceItem) r9
            androidx.slice.SliceItem r9 = defpackage.apl.a((androidx.slice.SliceItem) r9, (java.lang.String) r10)
            if (r9 != 0) goto L_0x0065
        L_0x0052:
            boolean r9 = r7.equals(r4)
            if (r9 != 0) goto L_0x0065
            boolean r9 = r6.equals(r4)
            if (r9 != 0) goto L_0x0065
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x006e
        L_0x0065:
            java.lang.Object r2 = r2.get(r0)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            r11.g = r2
        L_0x006e:
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r9 = "shortcut"
            r4[r0] = r9
            r4[r1] = r3
            java.util.List r10 = defpackage.apl.a((androidx.slice.SliceItem) r12, (java.lang.String) r7, (java.lang.String[]) r4, (java.lang.String[]) r5)
            java.util.List r4 = defpackage.apl.a((androidx.slice.SliceItem) r12, (java.lang.String) r8, (java.lang.String[]) r4, (java.lang.String[]) r5)
            r10.addAll(r4)
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = r12.b
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x00a2
            androidx.slice.Slice r4 = r12.f()
            java.util.List r4 = r4.c()
            int r4 = r4.size()
            if (r4 == r1) goto L_0x009f
            goto L_0x00a2
        L_0x009f:
            r11.a = r12
            goto L_0x00cd
        L_0x00a2:
            androidx.slice.SliceItem r4 = r11.g
            if (r4 == 0) goto L_0x00bf
            int r4 = r10.size()
            if (r4 <= r1) goto L_0x00bf
            java.lang.Object r4 = r10.get(r0)
            androidx.slice.SliceItem r5 = r11.g
            if (r4 == r5) goto L_0x00b5
            goto L_0x00bf
        L_0x00b5:
            java.lang.Object r4 = r10.get(r1)
            androidx.slice.SliceItem r4 = (androidx.slice.SliceItem) r4
            r11.a = r4
            goto L_0x00cd
        L_0x00bf:
            int r4 = r10.size()
            if (r4 <= 0) goto L_0x00cd
            java.lang.Object r4 = r10.get(r0)
            androidx.slice.SliceItem r4 = (androidx.slice.SliceItem) r4
            r11.a = r4
        L_0x00cd:
            java.util.ArrayList r4 = c(r12)
            int r5 = r4.size()
            if (r5 != r1) goto L_0x011e
            java.lang.Object r5 = r4.get(r0)
            androidx.slice.SliceItem r5 = (androidx.slice.SliceItem) r5
            java.lang.String r5 = r5.b
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x00f3
            java.lang.Object r5 = r4.get(r0)
            androidx.slice.SliceItem r5 = (androidx.slice.SliceItem) r5
            java.lang.String r5 = r5.b
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x011e
        L_0x00f3:
            java.lang.Object r5 = r4.get(r0)
            androidx.slice.SliceItem r5 = (androidx.slice.SliceItem) r5
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r0] = r9
            r2[r1] = r3
            boolean r2 = r5.a((java.lang.String[]) r2)
            if (r2 != 0) goto L_0x011e
            java.lang.Object r2 = r4.get(r0)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            boolean r2 = b(r2)
            if (r2 == 0) goto L_0x011e
            java.lang.Object r12 = r4.get(r0)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            java.util.ArrayList r4 = c(r12)
            r2 = 1
            goto L_0x011f
        L_0x011e:
            r2 = 0
        L_0x011f:
            java.lang.String r5 = r12.c
            java.lang.String r7 = "range"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x017c
            androidx.slice.SliceItem r5 = defpackage.apl.a((androidx.slice.SliceItem) r12, (java.lang.String) r8, (java.lang.String) r7)
            if (r5 != 0) goto L_0x0130
            goto L_0x0179
        L_0x0130:
            if (r2 != 0) goto L_0x0179
            androidx.slice.SliceItem r2 = r11.g
            r4.remove(r2)
            int r2 = r4.size()
            if (r2 != r1) goto L_0x015e
            java.lang.Object r2 = r4.get(r0)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            boolean r2 = b(r2)
            if (r2 == 0) goto L_0x015d
            java.lang.Object r12 = r4.get(r0)
            androidx.slice.SliceItem r12 = (androidx.slice.SliceItem) r12
            java.util.ArrayList r4 = c(r12)
            r11.d = r12
            androidx.slice.SliceItem r2 = r11.b()
            r4.remove(r2)
            goto L_0x017d
        L_0x015d:
            goto L_0x017d
        L_0x015e:
            androidx.slice.SliceItem r2 = defpackage.apl.a((androidx.slice.SliceItem) r12, (java.lang.String) r8, (java.lang.String) r7)
            r11.d = r2
            java.util.ArrayList r2 = c(r2)
            androidx.slice.SliceItem r5 = r11.b()
            r2.remove(r5)
            androidx.slice.SliceItem r5 = r11.d
            r4.remove(r5)
            r4.addAll(r2)
            goto L_0x017d
        L_0x0179:
            r11.d = r12
            goto L_0x017d
        L_0x017c:
        L_0x017d:
            java.lang.String r2 = r12.c
            java.lang.String r5 = "selection"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            r11.e = r12
        L_0x018a:
            int r12 = r4.size()
            if (r12 <= 0) goto L_0x025e
            androidx.slice.SliceItem r12 = r11.g
            if (r12 != 0) goto L_0x0195
            goto L_0x0198
        L_0x0195:
            r4.remove(r12)
        L_0x0198:
            androidx.slice.SliceItem r12 = r11.a
            if (r12 != 0) goto L_0x019d
            goto L_0x01a0
        L_0x019d:
            r4.remove(r12)
        L_0x01a0:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r2 = 0
        L_0x01a6:
            int r5 = r4.size()
            if (r2 >= r5) goto L_0x01fb
            java.lang.Object r5 = r4.get(r2)
            androidx.slice.SliceItem r5 = (androidx.slice.SliceItem) r5
            java.lang.String r7 = r5.b
            java.lang.String r9 = "text"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x01f5
            androidx.slice.SliceItem r7 = r11.h
            java.lang.String r9 = "summary"
            if (r7 == 0) goto L_0x01c8
            boolean r7 = r7.a((java.lang.String) r3)
            if (r7 != 0) goto L_0x01d9
        L_0x01c8:
            boolean r7 = r5.a((java.lang.String) r3)
            if (r7 == 0) goto L_0x01d9
            boolean r7 = r5.a((java.lang.String) r9)
            if (r7 == 0) goto L_0x01d6
            goto L_0x01d9
        L_0x01d6:
            r11.h = r5
            goto L_0x01f8
        L_0x01d9:
            androidx.slice.SliceItem r7 = r11.i
            if (r7 != 0) goto L_0x01e7
            boolean r7 = r5.a((java.lang.String) r9)
            if (r7 == 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            r11.i = r5
            goto L_0x01f8
        L_0x01e7:
            androidx.slice.SliceItem r7 = r11.j
            if (r7 == 0) goto L_0x01ec
            goto L_0x01f8
        L_0x01ec:
            boolean r7 = r5.a((java.lang.String) r9)
            if (r7 == 0) goto L_0x01f8
            r11.j = r5
            goto L_0x01f8
        L_0x01f5:
            r12.add(r5)
        L_0x01f8:
            int r2 = r2 + 1
            goto L_0x01a6
        L_0x01fb:
            androidx.slice.SliceItem r2 = r11.h
            boolean r2 = a(r2)
            if (r2 == 0) goto L_0x0208
            int r2 = r11.k
            int r2 = r2 + r1
            r11.k = r2
        L_0x0208:
            androidx.slice.SliceItem r2 = r11.i
            boolean r2 = a(r2)
            if (r2 == 0) goto L_0x0215
            int r2 = r11.k
            int r2 = r2 + r1
            r11.k = r2
        L_0x0215:
            androidx.slice.SliceItem r2 = r11.g
            if (r2 == 0) goto L_0x0223
            java.lang.String r2 = r2.b
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0223
            r2 = 1
            goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
        L_0x0225:
            int r3 = r12.size()
            if (r0 >= r3) goto L_0x025e
            java.lang.Object r3 = r12.get(r0)
            androidx.slice.SliceItem r3 = (androidx.slice.SliceItem) r3
            androidx.slice.SliceItem r4 = defpackage.apl.a((androidx.slice.SliceItem) r3, (java.lang.String) r8)
            java.lang.String r5 = r3.b
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0253
            if (r4 == 0) goto L_0x024d
            apd r4 = new apd
            r4.<init>(r3)
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x024d
            java.util.ArrayList r5 = r11.c
            r5.add(r4)
        L_0x024d:
            java.util.ArrayList r4 = r11.b
            r4.add(r3)
            goto L_0x025b
        L_0x0253:
            if (r2 != 0) goto L_0x025b
            java.util.ArrayList r2 = r11.b
            r2.add(r3)
            r2 = 1
        L_0x025b:
            int r0 = r0 + 1
            goto L_0x0225
        L_0x025e:
            boolean r12 = super.a()
            if (r12 == 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.g
            if (r12 != 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.a
            if (r12 != 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.h
            if (r12 != 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.i
            if (r12 != 0) goto L_0x02ab
            java.util.ArrayList r12 = r11.b
            int r12 = r12.size()
            if (r12 > 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.d
            if (r12 != 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.e
            if (r12 != 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.f
            java.lang.String r12 = r12.b
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.f
            androidx.slice.Slice r12 = r12.f()
            java.lang.String[] r12 = r12.e
            java.lang.String r0 = "see_more"
            boolean r12 = defpackage.anq.a(r12, r0)
            if (r12 == 0) goto L_0x02ab
            androidx.slice.SliceItem r12 = r11.f
            androidx.slice.Slice r12 = r12.f()
            java.util.List r12 = r12.c()
            r12.isEmpty()
        L_0x02ab:
            return
        L_0x02ac:
            java.lang.String r12 = "RowContent"
            java.lang.String r0 = "Provided SliceItem is invalid for RowContent"
            android.util.Log.w(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aps.<init>(androidx.slice.SliceItem):void");
    }

    private static boolean a(SliceItem sliceItem) {
        return sliceItem != null && (sliceItem.a("partial") || !TextUtils.isEmpty(sliceItem.b()));
    }

    private static boolean b(SliceItem sliceItem) {
        int i2;
        if (sliceItem != null && ("slice".equals(sliceItem.b) || "action".equals(sliceItem.b))) {
            List c2 = sliceItem.f().c();
            if (!sliceItem.a("see_more")) {
                i2 = 0;
            } else if (c2.isEmpty()) {
                return true;
            } else {
                i2 = 0;
            }
            while (i2 < c2.size()) {
                if (a(sliceItem, (SliceItem) c2.get(i2))) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    private static ArrayList c(SliceItem sliceItem) {
        ArrayList arrayList = new ArrayList();
        for (SliceItem sliceItem2 : sliceItem.f().c()) {
            if (a(sliceItem, sliceItem2)) {
                arrayList.add(sliceItem2);
            }
        }
        return arrayList;
    }

    private static boolean a(SliceItem sliceItem, SliceItem sliceItem2) {
        if (sliceItem2.a("keywords", "ttl", "last_updated", "horizontal") || "content_description".equals(sliceItem2.c) || "selection_option_key".equals(sliceItem2.c) || "selection_option_value".equals(sliceItem2.c)) {
            return false;
        }
        String str = sliceItem2.b;
        if ("image".equals(str) || "text".equals(str) || "long".equals(str) || "action".equals(str) || "input".equals(str) || "slice".equals(str) || ("int".equals(str) && "range".equals(sliceItem.c))) {
            return true;
        }
        return false;
    }

    public final SliceItem b() {
        SliceItem sliceItem = this.d;
        if (sliceItem == null) {
            return null;
        }
        List c2 = sliceItem.f().c();
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if ("image".equals(((SliceItem) c2.get(i2)).b)) {
                return (SliceItem) c2.get(i2);
            }
        }
        return null;
    }
}

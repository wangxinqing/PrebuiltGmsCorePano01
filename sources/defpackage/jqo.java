package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.util.List;

/* renamed from: jqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqo implements ax {
    public boolean a;
    public final ExpandableLinearLayout b;
    public final ExpandableLinearLayout c;
    public final CardButton d;
    public final jtf e;
    private final TextView f;
    private final TextView g;
    private final View h;

    public jqo(View view, jtf jtf) {
        this.h = view;
        this.e = jtf;
        CardButton cardButton = (CardButton) view.findViewById(R.id.card_button);
        this.d = cardButton;
        cardButton.setOnClickListener(new jqn(this));
        this.f = (TextView) view.findViewById(R.id.education_title);
        this.g = (TextView) view.findViewById(R.id.employment_title);
        this.b = (ExpandableLinearLayout) view.findViewById(R.id.education);
        this.c = (ExpandableLinearLayout) view.findViewById(R.id.employment);
        view.setVisibility(8);
    }

    private final void a(ExpandableLinearLayout expandableLinearLayout, List list, Drawable drawable) {
        amri amri;
        amri amri2;
        for (int i = 0; i < list.size(); i++) {
            avjz avjz = (avjz) list.get(i);
            if (avjz.c.isEmpty() || avjz.a.isEmpty()) {
                amri = !avjz.c.isEmpty() ? amri.b(avjz.c) : !avjz.a.isEmpty() ? amri.b(avjz.a) : ampu.a;
            } else {
                amri = amri.b(this.h.getContext().getString(R.string.profile_employment_current_details, new Object[]{avjz.c, avjz.a}));
            }
            if (amri.a()) {
                jru a2 = jru.a();
                a2.a = (String) amri.b();
                if (!avjz.h) {
                    avop avop = avjz.e;
                    if (avop == null) {
                        avop = avop.d;
                    }
                    if (avop.a != 0) {
                        avop avop2 = avjz.g;
                        if (avop2 == null) {
                            avop2 = avop.d;
                        }
                        if (avop2.a != 0) {
                            Context context = this.h.getContext();
                            Object[] objArr = new Object[2];
                            avop avop3 = avjz.e;
                            if (avop3 == null) {
                                avop3 = avop.d;
                            }
                            objArr[0] = Integer.valueOf(avop3.a);
                            avop avop4 = avjz.g;
                            if (avop4 == null) {
                                avop4 = avop.d;
                            }
                            objArr[1] = Integer.valueOf(avop4.a);
                            amri2 = amri.b(context.getString(R.string.organizations_start_to_end, objArr));
                        }
                    }
                    avop avop5 = avjz.e;
                    if (avop5 == null) {
                        avop5 = avop.d;
                    }
                    if (avop5.a == 0) {
                        avop avop6 = avjz.g;
                        if (avop6 == null) {
                            avop6 = avop.d;
                        }
                        if (avop6.a == 0) {
                            amri2 = ampu.a;
                        } else {
                            avop avop7 = avjz.g;
                            if (avop7 == null) {
                                avop7 = avop.d;
                            }
                            amri2 = amri.b(String.valueOf(avop7.a));
                        }
                    } else {
                        avop avop8 = avjz.e;
                        if (avop8 == null) {
                            avop8 = avop.d;
                        }
                        amri2 = amri.b(String.valueOf(avop8.a));
                    }
                } else {
                    avop avop9 = avjz.e;
                    if (avop9 == null) {
                        avop9 = avop.d;
                    }
                    if (avop9.a != 0) {
                        Context context2 = this.h.getContext();
                        Object[] objArr2 = new Object[1];
                        avop avop10 = avjz.e;
                        if (avop10 == null) {
                            avop10 = avop.d;
                        }
                        objArr2[0] = Integer.valueOf(avop10.a);
                        amri2 = amri.b(context2.getString(R.string.organizations_start_to_present, objArr2));
                    } else {
                        amri2 = amri.b(this.h.getContext().getString(R.string.organizations_present));
                    }
                }
                if (amri2.a()) {
                    a2.b = (String) amri2.b();
                }
                if (expandableLinearLayout.getChildCount() == 0) {
                    a2.d = drawable;
                } else {
                    a2.b();
                }
                expandableLinearLayout.addView(a2.a(this.h.getContext(), expandableLinearLayout));
            }
        }
    }

    public final void a() {
        this.a = false;
        this.d.a();
        this.b.a(1);
        this.c.a(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.amri r7) {
        /*
            r6 = this;
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.b
            r0.removeAllViews()
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.c
            r0.removeAllViews()
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.b
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.f
            r0.setVisibility(r1)
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.c
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.g
            r0.setVisibility(r1)
            com.google.android.gms.contactsheet.card.common.CardButton r0 = r6.d
            r0.setVisibility(r1)
            android.view.View r0 = r6.h
            r0.setVisibility(r1)
            boolean r0 = r7.a()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r7 = r7.b()
            avka r7 = (defpackage.avka) r7
            aucx r0 = r7.a
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0068
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.c
            aucx r3 = r7.a
            android.view.View r4 = r6.h
            android.content.Context r4 = r4.getContext()
            r5 = 2131231841(0x7f080461, float:1.8079774E38)
            android.graphics.drawable.Drawable r4 = defpackage.uj.b(r4, r5)
            r6.a(r0, r3, r4)
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.c
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L_0x0068
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r0 = r6.c
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.g
            r0.setVisibility(r2)
            r0 = 1
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            aucx r3 = r7.b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0098
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r3 = r6.b
            aucx r7 = r7.b
            android.view.View r4 = r6.h
            android.content.Context r4 = r4.getContext()
            r5 = 2131231828(0x7f080454, float:1.8079748E38)
            android.graphics.drawable.Drawable r4 = defpackage.uj.b(r4, r5)
            r6.a(r3, r7, r4)
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r7 = r6.b
            int r7 = r7.getChildCount()
            if (r7 == 0) goto L_0x0098
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r7 = r6.b
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f
            r7.setVisibility(r2)
            goto L_0x009a
        L_0x0098:
            if (r0 == 0) goto L_0x00b7
        L_0x009a:
            android.view.View r7 = r6.h
            r7.setVisibility(r2)
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r7 = r6.c
            int r7 = r7.getChildCount()
            if (r7 > r1) goto L_0x00af
            com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout r7 = r6.b
            int r7 = r7.getChildCount()
            if (r7 <= r1) goto L_0x00b7
        L_0x00af:
            com.google.android.gms.contactsheet.card.common.CardButton r7 = r6.d
            r7.setVisibility(r2)
            r6.a()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqo.a(amri):void");
    }
}

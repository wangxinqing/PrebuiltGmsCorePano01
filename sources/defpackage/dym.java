package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.ui.widget.AvatarReferenceImageView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: dym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dym extends dyj {
    private static final int[][] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    private static ColorStateList o;
    private static ColorStateList p;
    private static ColorStateList q;
    private static ColorStateList r;
    public final ArrayList f = new ArrayList();
    public int g = -1;
    private final SparseIntArray h = new SparseIntArray();
    private final ArrayList i = new ArrayList();

    static {
        int[][] iArr = {new int[]{16842913}, new int[0]};
        j = iArr;
        k = new int[iArr.length];
        l = new int[iArr.length];
        m = new int[iArr.length];
        n = new int[iArr.length];
    }

    public dym() {
        a(true);
    }

    private static ColorStateList a(ColorStateList colorStateList, int[] iArr, int i2) {
        if (iArr[0] == i2 && colorStateList != null) {
            return colorStateList;
        }
        iArr[0] = i2;
        return new ColorStateList(j, iArr);
    }

    private final int c(ViewGroup viewGroup, int i2) {
        int a = a(i2);
        int i3 = this.h.get(a, -1);
        if (i3 >= 0) {
            return i3;
        }
        adl a2 = a(viewGroup, a);
        if (a2.d() == -1) {
            a2.a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredHeight = a2.a.getMeasuredHeight();
        this.h.put(a, measuredHeight);
        return measuredHeight;
    }

    private final int e(int i2, int i3) {
        return i3 - i(i2);
    }

    private static int j(int i2) {
        return lk.a(i2, -1, 0.3f);
    }

    private final int k(int i2) {
        int i3 = 0;
        for (int i4 = 1; i4 < this.f.size(); i4++) {
            int i5 = i4 - 1;
            i3 += ((dyj) this.f.get(i5)).a();
            if (i2 < i3) {
                return i5;
            }
        }
        return this.f.size() - 1;
    }

    public final long J(int i2) {
        int k2 = k(i2);
        return (((long) k2) << 32) | (((dyj) this.f.get(k2)).J(e(k2, i2)) & 4294967295L);
    }

    public final void b(RecyclerView recyclerView) {
        if (this.i.size() != a()) {
            c(recyclerView);
        }
    }

    public final void d() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).d();
        }
    }

    public final int f() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += ((dyj) this.f.get(i3)).f();
        }
        return i2;
    }

    public final int g() {
        int i2 = this.g;
        if (i2 >= 0) {
            return i(i2);
        }
        return Integer.MAX_VALUE;
    }

    public final int getPositionForSection(int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f.size()) {
            int f2 = ((dyj) this.f.get(i3)).f() + i4;
            if (i2 < f2) {
                return i(i3) + ((dyj) this.f.get(i3)).getPositionForSection(i2 - i4);
            }
            i3++;
            i4 = f2;
        }
        return 0;
    }

    public final int getSectionForPosition(int i2) {
        int k2 = k(i2);
        int i3 = 0;
        for (int i4 = 0; i4 < k2; i4++) {
            i3 += ((dyj) this.f.get(i4)).f();
        }
        return i3 + ((dyj) this.f.get(k2)).getSectionForPosition(i2 - i(k2));
    }

    public final Object[] getSections() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            dyj dyj = (dyj) this.f.get(i2);
            if (dyj.f() > 0) {
                arrayList.addAll(Arrays.asList(dyj.getSections()));
            }
        }
        return arrayList.toArray();
    }

    public final int h(int i2) {
        return ((Integer) this.i.get(i2)).intValue();
    }

    public final int i(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += ((dyj) this.f.get(i4)).a();
        }
        return i3;
    }

    static void a(icc icc, wli wli, dzp dzp, ContactPerson contactPerson, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, int i2) {
        String str;
        String str2;
        String str3;
        int i3;
        int i4;
        int i5;
        boolean z6;
        int i6;
        String str4;
        int i7;
        int i8;
        Drawable drawable;
        int i9;
        int i10;
        String str5;
        String str6;
        int i11;
        Drawable drawable2;
        dzp dzp2 = dzp;
        ContactPerson contactPerson2 = contactPerson;
        SparseIntArray sparseIntArray3 = sparseIntArray;
        SparseIntArray sparseIntArray4 = sparseIntArray2;
        int i12 = dzp2.f;
        int j2 = !z2 ? i2 : j(i2);
        Context context = dzp2.a.getContext();
        Resources resources = dzp2.a.getResources();
        ContactPerson.ContactMethod a = contactPerson.a();
        String a2 = eap.a(context, contactPerson2);
        if (a2 == null) {
            str = "";
        } else {
            str = a2;
        }
        TextView textView = dzp2.z;
        textView.setText(a2);
        TextView textView2 = dzp2.A;
        if (!z || textView2 == null) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            textView.setVisibility(0);
            if (z2) {
                l[1] = j(resources.getColor(R.color.appinvite_dark_black));
                ColorStateList a3 = a(p, l, j2);
                p = a3;
                textView.setTextColor(a3);
            } else {
                k[1] = resources.getColor(R.color.appinvite_dark_black);
                ColorStateList a4 = a(o, k, j2);
                o = a4;
                textView.setTextColor(a4);
            }
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(a2);
        }
        AvatarReferenceImageView avatarReferenceImageView = dzp2.v;
        avatarReferenceImageView.a(a2);
        icc icc2 = icc;
        AvatarReferenceImageView avatarReferenceImageView2 = avatarReferenceImageView;
        String str7 = a2;
        TextView textView3 = textView;
        String str8 = str;
        eam.a(icc2, wli, avatarReferenceImageView2, contactPerson, a, z3);
        if (i12 != R.layout.appinvite_contextual_selection_list_item) {
            View view = dzp2.u;
            if (view != null) {
                if (z) {
                    drawable2 = eav.a(context, R.drawable.appinvite_avatar_highlight, j2, false);
                } else {
                    drawable2 = null;
                }
                view.setBackgroundDrawable(drawable2);
            }
        } else {
            if (!z) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            avatarReferenceImageView2.setVisibility(i11);
        }
        if (a == null) {
            i6 = 0;
            z6 = false;
            i5 = 1;
            i4 = 0;
            i3 = 0;
            str3 = null;
            str2 = null;
        } else {
            int i13 = a.a;
            if (i13 != 0) {
                i5 = 1;
                if (i13 == 1) {
                    str6 = a.b;
                    i4 = R.drawable.appinvite_ic_email_black_36_crop;
                    i3 = R.drawable.quantum_ic_email_black_36;
                    str5 = null;
                    i10 = R.string.appinvite_contextual_selection_content_description_email;
                } else if (i13 != 2) {
                    str6 = null;
                    i4 = 0;
                    i3 = 0;
                    str5 = null;
                    i10 = 0;
                } else {
                    str6 = a.b;
                    String formatNumber = PhoneNumberUtils.formatNumber(str6);
                    i3 = R.drawable.quantum_ic_message_black_36;
                    i10 = R.string.appinvite_contextual_selection_content_description_sms;
                    str5 = formatNumber;
                    i4 = R.drawable.appinvite_ic_message_black_36_crop;
                }
            } else {
                i5 = 1;
                i4 = R.drawable.appinvite_ic_notifications_black_36_crop;
                str6 = null;
                i3 = R.drawable.quantum_ic_notifications_black_36;
                str5 = null;
                i10 = 0;
            }
            if (sparseIntArray3 == null) {
                str3 = str6;
                str2 = str5;
                i6 = i10;
                z6 = false;
            } else if (sparseIntArray3.indexOfKey(a.a) < 0) {
                str3 = str6;
                str2 = str5;
                i6 = i10;
                z6 = false;
            } else {
                int i14 = sparseIntArray3.get(a.a);
                if (sparseIntArray4 != null) {
                    i4 = sparseIntArray4.get(a.a);
                }
                i3 = i14;
                str3 = str6;
                str2 = str5;
                i6 = i10;
                z6 = true;
            }
        }
        View view2 = dzp2.w;
        if (view2 != null) {
            if (z) {
                view2.setVisibility(0);
                view2.setBackgroundResource(R.drawable.appinvite_contextual_selection_check_background);
                ImageView imageView = dzp2.x;
                if (imageView != null) {
                    if (i12 == R.layout.appinvite_contextual_selection_grid_item && !z5) {
                        Drawable a5 = eav.a(context, i3, resources.getColor(R.color.material_grey_white_1000), z6);
                        if (a5 == null) {
                            imageView.setImageResource(R.drawable.quantum_ic_check_white_48);
                        } else {
                            imageView.setImageDrawable(a5);
                        }
                    } else {
                        imageView.setImageResource(R.drawable.quantum_ic_check_white_48);
                    }
                }
            } else {
                view2.setVisibility(8);
            }
        }
        View view3 = dzp2.D;
        if (view3 != null) {
            view3.setVisibility(!z2 ? 8 : 0);
        }
        TextView textView4 = dzp2.E;
        if (textView4 != null) {
            textView4.setText(str3);
            if (!TextUtils.isEmpty(str3)) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            textView4.setVisibility(i9);
            if (z2) {
                n[i5] = j(resources.getColor(R.color.appinvite_medium_black));
                ColorStateList a6 = a(r, n, j2);
                r = a6;
                textView4.setTextColor(a6);
            } else {
                m[i5] = resources.getColor(R.color.appinvite_medium_black);
                ColorStateList a7 = a(q, m, j2);
                q = a7;
                textView4.setTextColor(a7);
            }
        }
        if (!z) {
            j2 = z2 ? j(resources.getColor(R.color.material_grey_600)) : resources.getColor(R.color.material_grey_600);
        }
        ImageView imageView2 = dzp2.y;
        if (imageView2 == null) {
            if (!z5) {
                drawable = eav.a(context, i3, j2, z6);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.appinvite_chip_method);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
            int i15 = Build.VERSION.SDK_INT;
            textView3.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            Drawable drawable3 = null;
            if (!z5) {
                drawable3 = eav.a(context, i4, j2, z6);
            }
            imageView2.setImageDrawable(drawable3);
            if (i12 == R.layout.appinvite_contextual_selection_grid_item) {
                if (z) {
                    i8 = 8;
                } else {
                    i8 = drawable3 != null ? 0 : 8;
                }
                imageView2.setVisibility(i8);
            }
        }
        if (i6 != 0) {
            String string = resources.getString(i6);
            StringBuilder sb = new StringBuilder(str8.length() + i5 + String.valueOf(string).length());
            sb.append(str8);
            sb.append(" ");
            sb.append(string);
            str4 = sb.toString();
        } else {
            str4 = str8;
        }
        ImageView imageView3 = dzp2.C;
        if (imageView3 == null) {
            i7 = 0;
        } else {
            int i16 = 4;
            if (z4 && contactPerson2.e.size() > i5) {
                i16 = 0;
            }
            imageView3.setVisibility(i16);
            i7 = 0;
            imageView3.setImageDrawable(eav.a(context, R.drawable.quantum_ic_arrow_drop_down_black_18, j2, false));
        }
        View view4 = dzp2.B;
        if (view4 != null) {
            if (z5 || contactPerson2.e.size() == 0) {
                i7 = 8;
            }
            view4.setVisibility(i7);
            String string2 = resources.getString(R.string.appinvite_contact_method_selector_description);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 2 + String.valueOf(string2).length());
            sb2.append(str7);
            sb2.append(", ");
            sb2.append(string2);
            view4.setContentDescription(sb2.toString());
        }
        if (dzp2.t != null) {
            if (str2 != null) {
                String valueOf = String.valueOf(str4);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + i5 + String.valueOf(str2).length());
                sb3.append(valueOf);
                sb3.append(" ");
                sb3.append(str2);
                str4 = sb3.toString();
            } else if (str3 != null) {
                String valueOf2 = String.valueOf(str4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + i5 + String.valueOf(str3).length());
                sb4.append(valueOf2);
                sb4.append(" ");
                sb4.append(str3);
                str4 = sb4.toString();
            }
            dzp2.t.setContentDescription(str4);
        }
    }

    public final void b(ContactPerson contactPerson) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).b(contactPerson);
        }
    }

    public final void d(boolean z) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).d(z);
        }
    }

    public final CharSequence e() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            CharSequence e = ((dyj) this.f.get(i2)).e();
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public final int g(int i2) {
        int k2 = k(i2);
        return ((dyj) this.f.get(k2)).g(e(k2, i2));
    }

    public final void b(CharSequence charSequence) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).b(charSequence);
        }
    }

    public final void e(boolean z) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).e(z);
        }
    }

    public final void g(boolean z) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).f(z);
        }
    }

    public final void b(boolean z) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).b(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).f(this.e);
        }
    }

    public final void c(RecyclerView recyclerView) {
        this.i.clear();
        int i2 = 0;
        if (recyclerView.getLayoutManager() instanceof abd) {
            abd abd = (abd) recyclerView.getLayoutManager();
            abc abc = abd.g;
            int i3 = abd.b;
            int i4 = 0;
            while (i2 < a()) {
                if (abc.a(i2, i3) == 0) {
                    i4 += c(recyclerView, i2);
                }
                this.i.add(Integer.valueOf(i4));
                i2++;
            }
            return;
        }
        int i5 = 0;
        while (i2 < a()) {
            i5 += c(recyclerView, i2);
            this.i.add(Integer.valueOf(i5));
            i2++;
        }
    }

    public final void c(CharSequence charSequence) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).c(charSequence);
        }
    }

    public final void c(boolean z) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).c(z);
        }
    }

    public final int a() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            i2 += ((dyj) this.f.get(i3)).a();
        }
        return i2;
    }

    public final int a(int i2) {
        int k2 = k(i2);
        return ((dyj) this.f.get(k2)).a(e(k2, i2));
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i2 == R.layout.appinvite_contextual_selection_recipients) {
            return new dzs(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_chip) {
            return new dzo(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_search) {
            return new dzr(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_header_text || i2 == R.layout.appinvite_contextual_selection_sub_header_text) {
            return new dzt(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_grid_item || i2 == R.layout.appinvite_contextual_selection_list_item) {
            return new dzp(inflate);
        }
        if (i2 == R.layout.appinvite_anchor) {
            return new adl(inflate);
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            adl a = ((dyj) this.f.get(i3)).a(viewGroup, i2);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public final void a(adl adl) {
        AvatarReferenceImageView avatarReferenceImageView;
        if ((adl instanceof dzp) && (avatarReferenceImageView = ((dzp) adl).v) != null) {
            avatarReferenceImageView.a();
        }
    }

    public final void a(adl adl, int i2) {
        int k2 = k(i2);
        ((dyj) this.f.get(k2)).a(adl, e(k2, i2));
    }

    public final void a(ContactPerson contactPerson) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).a(contactPerson);
        }
    }

    public final void a(ContactPerson contactPerson, int i2) {
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            ((dyj) this.f.get(i3)).a(contactPerson, i2);
        }
    }

    public final void a(CharSequence charSequence) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            ((dyj) this.f.get(i2)).a(charSequence);
        }
    }
}

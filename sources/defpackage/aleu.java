package defpackage;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: aleu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aleu extends Fragment {
    public alel a;
    public String b;
    public boolean c = true;
    public Integer d;
    public Integer e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    private alet k;
    private alee l;
    private aldu m;
    private aldg n;
    private aler o;
    private aldl p;
    private ViewGroup q;
    private aldh r;
    private final ArrayDeque s;
    private aleo t;
    private alda u;
    private aldi v;
    private ales w;

    public aleu() {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.s = arrayDeque;
        arrayDeque.push(1);
    }

    private final void a(int i2) {
        ViewGroup d2 = d();
        if (i2 == 1) {
            d2.addView(this.l);
            d2.addView(this.m);
        } else if (i2 != 2) {
            if (i2 == 3) {
                aldg aldg = new aldg(getActivity(), this.u);
                this.n = aldg;
                d2.addView(aldg);
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue != 3) {
                        b(intValue);
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Tried to setup unknown state ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        } else if (!this.o.isAdded() && ((Integer) this.s.peekFirst()).intValue() == 2) {
            getActivity().getSupportFragmentManager().beginTransaction().add(R.id.container, this.o, "search_fragment").commit();
        }
    }

    private final void b(int i2) {
        ViewGroup d2 = d();
        if (i2 == 1) {
            d2.removeView(this.m);
            d2.removeView(this.l);
        } else if (i2 != 2) {
            if (i2 == 3) {
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue != 3) {
                        a(intValue);
                    }
                }
                d2.removeView(this.n);
                return;
            }
            StringBuilder sb = new StringBuilder(43);
            sb.append("Tried to teardown unknown state ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        } else if (this.o.isAdded()) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.o).commit();
        }
    }

    private final ViewGroup d() {
        if (this.q == null) {
            this.q = (ViewGroup) getActivity().findViewById(R.id.container);
        }
        return this.q;
    }

    public final void c() {
        Integer num;
        aler aler = this.o;
        if (aler != null) {
            Integer num2 = this.d;
            Integer num3 = this.e;
            aler.e = num2;
            aler.f = num3;
        }
        aldu aldu = this.m;
        if (aldu != null && (num = this.d) != null && Color.alpha(num.intValue()) >= 255) {
            aldu.d.setBackgroundColor(num.intValue());
            int color = aldu.getResources().getColor(R.color.text_white_alpha_87);
            int a2 = akyq.a(num.intValue(), color, aldu.getResources().getColor(R.color.text_black_alpha_87));
            ((TextView) aldu.e.findViewById(R.id.toolbar_title)).setTextColor(a2);
            ImageButton imageButton = (ImageButton) aldu.e.findViewById(R.id.back_button);
            ImageButton imageButton2 = (ImageButton) aldu.e.findViewById(R.id.search_button);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) aldu.getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp);
            if (a2 == color) {
                imageButton.setImageDrawable(bitmapDrawable);
                imageButton2.setImageDrawable(aldu.getResources().getDrawable(R.drawable.ic_search_white_24dp));
                return;
            }
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
            imageButton.setImageDrawable(bitmapDrawable);
            imageButton2.setImageDrawable(aldu.getResources().getDrawable(R.drawable.ic_search));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        BitmapDrawable a2;
        super.onActivityCreated(bundle);
        if (this.v == null) {
            this.v = this.k.e();
        }
        aldi aldi = this.v;
        aldi.d++;
        aldi.a.e();
        aldi.c.e();
        aldi.b.e();
        if (this.w == null) {
            this.w = this.k.f();
        }
        if (this.r == null) {
            this.r = this.k.h();
        }
        if (this.t == null) {
            aldi aldi2 = this.v;
            ales ales = this.w;
            boolean z = this.c;
            ibq ibq = ren.a;
            this.t = new aleo(this, aldi2, ales, (LatLngBounds) ivy.a(getActivity().getIntent(), "latlng_bounds", LatLngBounds.CREATOR), rij.e, z);
        }
        this.t.g = this.a;
        if (this.u == null) {
            this.u = new alda(this, this.v, this.w);
        }
        aldl aldl = (aldl) getChildFragmentManager().findFragmentByTag("map_view_lifecycle_fragment");
        if (aldl == null) {
            aldl = new aldl();
        }
        this.p = aldl;
        this.l = new alee(getActivity(), this.t, this.p);
        this.m = new aldu(getActivity(), this.t, this.c);
        aler aler = (aler) getActivity().getSupportFragmentManager().findFragmentByTag("search_fragment");
        if (aler == null) {
            aler = new aler();
        }
        aler.a = this;
        aler.b = this.w;
        aler.c = this.b;
        this.o = aler;
        this.t.h = aler;
        c();
        if (!this.p.isAdded()) {
            getChildFragmentManager().beginTransaction().add((Fragment) this.p, "map_view_lifecycle_fragment").commit();
            getChildFragmentManager().executePendingTransactions();
        }
        Iterator descendingIterator = this.s.descendingIterator();
        while (descendingIterator.hasNext()) {
            a(((Integer) descendingIterator.next()).intValue());
        }
        if (this.g && (a2 = this.r.a(this.f, this.h)) != null) {
            alee alee = this.l;
            int i2 = this.i;
            int i3 = this.j;
            if (a2.getBitmap() != null) {
                alee.g = i2;
                alee.h = i3;
                alee.f = ruw.a(a2.getBitmap());
                rvb rvb = alee.e;
                if (rvb != null) {
                    rvb.a();
                    alee.e = null;
                }
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof alet) {
            this.k = (alet) activity;
        }
    }

    public final void onDetach() {
        super.onDetach();
        if (this.k instanceof Activity) {
            this.k = null;
        }
        aldi aldi = this.v;
        if (aldi != null) {
            int i2 = aldi.d - 1;
            aldi.d = i2;
            if (i2 <= 0) {
                aldi.a.g();
                aldi.c.g();
                aldi.b.g();
            }
            if (aldi.d < 0) {
                throw new IllegalStateException("Received more disconnections than connects");
            }
        }
        this.p.a((MapView) null);
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.t.a((alek) null);
        this.t.a((alen) null);
        aleo aleo = this.t;
        aleo.g = null;
        aleo.h = null;
        this.u.a((alcx) null);
    }

    public final void onPause() {
        super.onPause();
        aleo aleo = this.t;
        if (aleo.c.i()) {
            icc icc = aleo.c;
            icc.b((idf) new rft(icc, aleo.o));
        }
    }

    public final void onResume() {
        super.onResume();
        this.t.a();
    }

    public final void a() {
        this.s.addFirst(2);
        a(2);
    }

    public final void b() {
        b(((Integer) this.s.removeFirst()).intValue());
        if (this.s.isEmpty()) {
            ales ales = this.w;
            ales.a();
            aucd aucd = ales.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aodu aodu = (aodu) aucd.b;
            aodu aodu2 = aodu.f;
            aodu.c = 0;
            aodu.a |= 64;
            this.w.a(getActivity());
            getActivity().supportFinishAfterTransition();
        }
    }

    public final void a(LatLng latLng) {
        alda alda = this.u;
        alda.b();
        alda.g = null;
        alda.h = latLng;
        alda.i = null;
        alda.a();
        String a2 = aue.a(latLng.a, latLng.b);
        ales ales = alda.d;
        ales.a();
        aucd aucd = ales.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aodu aodu = (aodu) aucd.b;
        aodu aodu2 = aodu.f;
        aodu.c = 1;
        aodu.a |= 64;
        alda.a(a2, 5);
        this.s.addFirst(3);
        a(3);
    }

    public final void b(rhq rhq) {
        Intent intent = new Intent();
        ivy.a(rhq.n(), intent, "selected_place");
        if (rhq.i() != null) {
            intent.putExtra("third_party_attributions", rhq.i());
        }
        LatLngBounds latLngBounds = this.t.j;
        if (latLngBounds != null) {
            ivy.a((SafeParcelable) latLngBounds, intent, "final_latlng_bounds");
        }
        Activity activity = getActivity();
        this.w.a(activity);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void a(rhq rhq) {
        alda alda = this.u;
        alda.b();
        rhq rhq2 = alda.g;
        if (rhq2 != null && !rhq2.equals(rhq)) {
            alda.j = null;
        }
        alda.g = rhq;
        alda.h = null;
        alda.i = null;
        alda.a();
        this.s.addFirst(3);
        a(3);
    }
}

package defpackage;

import android.content.Intent;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.pano.chimera.Action;
import com.google.android.pano.widget.FrameLayoutWithShadows;
import java.util.ArrayList;

/* renamed from: aked  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aked extends Activity implements FragmentManager.OnBackStackChangedListener, akdo {
    public View a;
    private akee b;
    private final int c = R.layout.two_pane_dialog_frame;
    private int d = 0;

    public aked() {
        akee akee = new akee();
        this.b = akee;
        akee.a = this;
    }

    /* access modifiers changed from: protected */
    public final akee a() {
        akee akee;
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || (akee = (akee) fragmentManager.findFragmentByTag("tag_dialog")) == null)) {
            this.b = akee;
        }
        return this.b;
    }

    public void a(Action action) {
        throw null;
    }

    public final void onBackStackChanged() {
        int backStackEntryCount = getFragmentManager().getBackStackEntryCount();
        if (backStackEntryCount > 0 && backStackEntryCount < this.d && "backstack_name_dialog".equals(getFragmentManager().getBackStackEntryAt(backStackEntryCount - 1).getName())) {
            getFragmentManager().popBackStack();
        }
        this.d = backStackEntryCount;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        getWindow().addFlags(33554432);
        if (bundle != null) {
            this.d = bundle.getInt("backstack_count");
        }
        super.onCreate(bundle);
        getFragmentManager().addOnBackStackChangedListener(this);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(this.c, (ViewGroup) null);
        this.a = inflate;
        setContentView(inflate);
        if (this.c == R.layout.two_pane_dialog_frame) {
            layoutInflater.inflate(R.layout.dialog_container, (ViewGroup) this.a);
            akee akee = this.b;
            akee.a = this;
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (fragmentManager.findFragmentByTag("tag_dialog") != null) {
                beginTransaction.addToBackStack("backstack_name_dialog");
            }
            beginTransaction.replace(R.id.dialog_fragment, akee, "tag_dialog");
            beginTransaction.commit();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("create_fragment_from_extra")) {
            String string = extras.getString("dialog_title");
            String string2 = extras.getString("dialog_breadcrumb");
            String string3 = extras.getString("dialog_description");
            Uri parse = Uri.parse(extras.getString("dialog_image_uri"));
            int i2 = extras.getInt("dialog_image_background_color");
            ArrayList parcelableArrayList = extras.getParcelableArrayList("parcelable_actions");
            akec akec = new akec();
            akec.setArguments(akdv.a(string, string2, string3, parse, i2));
            a().a((Fragment) akec).commit();
            akds a2 = akds.a(parcelableArrayList);
            akee a3 = a();
            a3.a(a2, (FragmentTransaction) null, a3.a().getFragmentManager()).commit();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("backstack_count", this.d);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        TextView textView;
        akey akey;
        Uri uri;
        super.onStart();
        if (this.c == R.layout.two_pane_dialog_frame) {
            akee a2 = a();
            akdz akdz = a2.b;
            if (akdz.d) {
                akdz.d = false;
                Fragment findFragmentByTag = a2.a().getFragmentManager().findFragmentByTag("content");
                if (findFragmentByTag instanceof akec) {
                    akec akec = (akec) findFragmentByTag;
                    akdz akdz2 = a2.b;
                    Activity a3 = a2.a();
                    ViewGroup viewGroup = (ViewGroup) ((aked) a2.a()).findViewById(16908290);
                    akdv akdv = akec.a;
                    int i = akdv.g;
                    Uri uri2 = akdv.h;
                    ImageView imageView = akdv.a.getView() != null ? (ImageView) akdv.a.getView().findViewById(R.id.icon) : null;
                    akdv akdv2 = akec.a;
                    TextView textView2 = akdv2.a.getView() != null ? (TextView) akdv2.a.getView().findViewById(R.id.title) : null;
                    akdv akdv3 = akec.a;
                    TextView textView3 = akdv3.a.getView() != null ? (TextView) akdv3.a.getView().findViewById(R.id.description) : null;
                    akdv akdv4 = akec.a;
                    if (akdv4.a.getView() != null) {
                        textView = (TextView) akdv4.a.getView().findViewById(R.id.breadcrumb);
                    } else {
                        textView = null;
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) viewGroup.getChildAt(0);
                    relativeLayout.setVisibility(4);
                    Intent intent = a3.getIntent();
                    ArrayList arrayList = new ArrayList();
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        aker aker = new aker();
                        if (aker.a(a3, intent.getSourceBounds(), extras)) {
                            arrayList.add(aker);
                        }
                        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("com.google.android.pano.transition_multiple_bitmap");
                        if (parcelableArrayExtra != null) {
                            int length = parcelableArrayExtra.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    if (!(parcelableArrayExtra[i2] instanceof Bundle)) {
                                        akey = null;
                                        break;
                                    }
                                    aker aker2 = new aker();
                                    Parcelable[] parcelableArr = parcelableArrayExtra;
                                    if (aker2.a(a3, (Rect) null, (Bundle) parcelableArrayExtra[i2])) {
                                        arrayList.add(aker2);
                                    }
                                    i2++;
                                    parcelableArrayExtra = parcelableArr;
                                } else {
                                    break;
                                }
                            }
                        }
                        akey = null;
                    } else {
                        akey = null;
                    }
                    if (arrayList.size() <= 0) {
                        uri = akey;
                    } else {
                        if (i != 0) {
                            String valueOf = String.valueOf(a3.getResources().getResourceName(i).replace(":", "/"));
                            uri2 = Uri.parse(valueOf.length() == 0 ? new String("android.resource://") : "android.resource://".concat(valueOf));
                        } else if (uri2 == null) {
                            uri2 = akey;
                        }
                        aker aker3 = (aker) arrayList.get(0);
                        if (uri2 != null) {
                            akey akey2 = new akey(viewGroup);
                            if (akey2.h == 0) {
                                akfa akfa = new akfa(akey2.b.getContext());
                                akey2.b.addView(akfa);
                                akfa.a = aker3;
                                akfa.c = akfa.a.b;
                                akfa.c.mutate();
                                akfa.a.a(akfa.z);
                                ViewGroup.LayoutParams layoutParams = akfa.getLayoutParams();
                                layoutParams.width = akfa.z.width();
                                layoutParams.height = akfa.z.height();
                                akfa.B.set(akfa.a.h);
                                akfa.B.offset((float) (-akfa.z.left), (float) (-akfa.z.top));
                                akfa.A.set(akfa.a.g);
                                akfa.A.offset((float) (-akfa.z.left), (float) (-akfa.z.top));
                                float f = akfa.a.e;
                                if (f != 1.0f) {
                                    akfa.c.setAlpha((int) (f * 255.0f));
                                }
                                float f2 = akfa.a.f;
                                if (f2 != 1.0f) {
                                    akfa.G.setSaturation(f2);
                                    akfa.c.setColorFilter(new ColorMatrixColorFilter(akfa.G));
                                }
                                int i3 = akfa.a.d;
                                akfa.F = i3;
                                if (i3 != 0) {
                                    akfa.setBackgroundColor(i3);
                                    akfa.getBackground().setAlpha((int) (akfa.a.e * 255.0f));
                                }
                                akfa.invalidate();
                                akey2.e.add(akfa);
                                if (!akey2.i) {
                                    akey2.i = true;
                                    akey2.b.addOnLayoutChangeListener(akey2.j);
                                }
                            }
                            akey2.c = 250;
                            akey2.d = 0;
                            akey2.a = new DecelerateInterpolator(1.0f);
                            akey = akey2;
                            uri = uri2;
                        } else {
                            uri = uri2;
                        }
                    }
                    a3.overridePendingTransition(R.anim.hard_cut_in, R.anim.pano_fade_out);
                    akdz2.f.setColor(akdz2.e.getResources().getColor(R.color.dialog_activity_background));
                    akdz2.f.setAlpha(0);
                    relativeLayout.setBackground(akdz2.f);
                    akdz2.c = (FrameLayoutWithShadows) relativeLayout.findViewById(R.id.shadow_layout);
                    if (akey != null) {
                        akey.f = new akex(akdz2, imageView);
                        imageView.setAlpha(0.0f);
                        FrameLayoutWithShadows frameLayoutWithShadows = akdz2.c;
                        if (frameLayoutWithShadows != null) {
                            frameLayoutWithShadows.a(0.0f);
                        }
                    }
                    relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new akdx(akdz2, relativeLayout, textView2, textView, textView3, a3, imageView, akey, uri));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Fragment fragment, Fragment fragment2) {
        akee a2 = a();
        a2.a(fragment2, a2.a(fragment), a2.a().getFragmentManager()).commit();
    }
}

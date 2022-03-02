package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* renamed from: gj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class gj implements ComponentCallbacks, View.OnCreateContextMenuListener, aj, bt, anp {
    static final Object l = new Object();
    boolean A;
    boolean B;
    int C;
    public hl D;
    gx E;
    hl F = new hl();
    gj G;
    public int H;
    public int I;
    public String J;
    public boolean K;
    public boolean L;
    public boolean M;
    boolean N;
    boolean O;
    boolean P = true;
    public boolean Q;
    ViewGroup R;
    View S;
    boolean T;
    boolean U = true;
    gg V;
    boolean W;
    boolean X;
    float Y;
    LayoutInflater Z;
    boolean aa;
    public ad ab;
    al ac;
    im ad;
    final aw ae;
    ano af;
    public int m = -1;
    Bundle n;
    SparseArray o;
    Boolean p;
    public String q = UUID.randomUUID().toString();
    public Bundle r;
    gj s;
    String t = null;
    int u;
    public Boolean v = null;
    boolean w;
    public boolean x;
    public boolean y;
    boolean z;

    public gj() {
        new gd(this);
        this.ab = ad.RESUMED;
        this.ae = new aw();
        aN();
    }

    @Deprecated
    public static gj instantiate(Context context, String str, Bundle bundle) {
        try {
            return (gj) gw.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new gh("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new gh("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new gh("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    private final gg j() {
        if (this.V == null) {
            this.V = new gg();
        }
        return this.V;
    }

    /* access modifiers changed from: package-private */
    public final LayoutInflater a(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.Z = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public final void aN() {
        this.ac = new al(this);
        this.af = ano.a((anp) this);
        int i = Build.VERSION.SDK_INT;
        this.ac.a((ai) new ge(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.V != null || i != 0) {
            j();
            this.V.d = i;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.C > 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        gj parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.c());
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.F.c(1);
        if (this.S != null) {
            this.ad.a(ac.ON_DESTROY);
        }
        this.m = 1;
        this.Q = false;
        onDestroyView();
        if (this.Q) {
            iw iwVar = ((ix) is.a((aj) this)).a;
            int c = iwVar.d.c();
            for (int i = 0; i < c; i++) {
                ((it) iwVar.d.d(i)).e();
            }
            this.B = false;
            return;
        }
        throw new jz("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mTag=");
        printWriter.println(this.J);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.m);
        printWriter.print(" mWho=");
        printWriter.print(this.q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.w);
        printWriter.print(" mRemoving=");
        printWriter.print(this.x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.K);
        printWriter.print(" mDetached=");
        printWriter.print(this.L);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.P);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U);
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.D);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.E);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.G);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.r);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.n);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.o);
        }
        gj targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.u);
        }
        if (e() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(e());
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S);
        }
        if (f() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(f());
        }
        if (getContext() != null) {
            is.a((aj) this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.F + ":");
        hl hlVar = this.F;
        hlVar.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.c;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public final View f() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.n;
        }
        return false;
    }

    public final gl getActivity() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return (gl) gxVar.b;
        }
        return null;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        gg ggVar = this.V;
        if (ggVar == null || (bool = ggVar.l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        gg ggVar = this.V;
        if (ggVar == null || (bool = ggVar.k) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.r;
    }

    public final hl getChildFragmentManager() {
        if (this.E != null) {
            return this.F;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar.c;
        }
        return null;
    }

    public Object getEnterTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.e;
        }
        return null;
    }

    public Object getExitTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.g;
        }
        return null;
    }

    @Deprecated
    public final hl getFragmentManager() {
        return this.D;
    }

    public final Object getHost() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return ((gk) gxVar).a;
        }
        return null;
    }

    public final int getId() {
        return this.H;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.Z;
        return layoutInflater == null ? a((Bundle) null) : layoutInflater;
    }

    public ae getLifecycle() {
        return this.ac;
    }

    @Deprecated
    public is getLoaderManager() {
        return is.a((aj) this);
    }

    public final gj getParentFragment() {
        return this.G;
    }

    public final hl getParentFragmentManager() {
        hl hlVar = this.D;
        if (hlVar != null) {
            return hlVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Object getReenterTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.h != l ? this.V.h : getExitTransition();
        }
        return null;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.M;
    }

    public Object getReturnTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.f != l ? this.V.f : getEnterTransition();
        }
        return null;
    }

    public final ann getSavedStateRegistry() {
        return this.af.a;
    }

    public Object getSharedElementEnterTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.i;
        }
        return null;
    }

    public Object getSharedElementReturnTransition() {
        gg ggVar = this.V;
        if (ggVar != null) {
            return ggVar.j != l ? this.V.j : getSharedElementEnterTransition();
        }
        return null;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.J;
    }

    public final gj getTargetFragment() {
        String str;
        gj gjVar = this.s;
        if (gjVar != null) {
            return gjVar;
        }
        hl hlVar = this.D;
        if (hlVar == null || (str = this.t) == null) {
            return null;
        }
        return hlVar.c(str);
    }

    public final int getTargetRequestCode() {
        return this.u;
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.U;
    }

    public View getView() {
        return this.S;
    }

    public bs getViewModelStore() {
        hl hlVar = this.D;
        if (hlVar != null) {
            ho hoVar = hlVar.r;
            bs bsVar = (bs) hoVar.f.get(this.q);
            if (bsVar != null) {
                return bsVar;
            }
            bs bsVar2 = new bs();
            hoVar.f.put(this.q, bsVar2);
            return bsVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        gg ggVar = this.V;
    }

    public final boolean hasOptionsMenu() {
        return this.O;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        gg ggVar = this.V;
    }

    public final boolean isAdded() {
        return this.E != null && this.w;
    }

    public final boolean isDetached() {
        return this.L;
    }

    public final boolean isHidden() {
        return this.K;
    }

    public final boolean isInLayout() {
        return this.z;
    }

    public final boolean isMenuVisible() {
        return this.P;
    }

    public final boolean isRemoving() {
        return this.x;
    }

    public final boolean isResumed() {
        return this.m >= 4;
    }

    public final boolean isStateSaved() {
        hl hlVar = this.D;
        if (hlVar != null) {
            return hlVar.f();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.S
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.isVisible():boolean");
    }

    public void onActivityCreated(Bundle bundle) {
        this.Q = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.Q = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.Q = true;
        b(bundle);
        hl hlVar = this.F;
        if (hlVar.j <= 0) {
            hlVar.h();
        }
    }

    public Animation onCreateAnimation(int i, boolean z2, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z2, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroy() {
        this.Q = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.Q = true;
    }

    public void onDetach() {
        this.Q = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z2) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.Q = true;
    }

    public void onLowMemory() {
        this.Q = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.Q = true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onResume() {
        this.Q = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.Q = true;
    }

    public void onStop() {
        this.Q = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.Q = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final gl requireActivity() {
        gl activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        j().l = Boolean.valueOf(z2);
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        j().k = Boolean.valueOf(z2);
    }

    public void setArguments(Bundle bundle) {
        if (this.D == null || !isStateSaved()) {
            this.r = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterTransition(Object obj) {
        j().e = obj;
    }

    public void setExitTransition(Object obj) {
        j().g = obj;
    }

    public void setHasOptionsMenu(boolean z2) {
        if (this.O != z2) {
            this.O = z2;
            if (isAdded() && !isHidden()) {
                this.E.b();
            }
        }
    }

    public void setInitialSavedState(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.D == null) {
            Bundle bundle2 = null;
            if (!(fragment$SavedState == null || (bundle = fragment$SavedState.a) == null)) {
                bundle2 = bundle;
            }
            this.n = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z2) {
        if (this.P != z2) {
            this.P = z2;
            if (this.O && isAdded() && !isHidden()) {
                this.E.b();
            }
        }
    }

    public void setReenterTransition(Object obj) {
        j().h = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        this.M = z2;
        hl hlVar = this.D;
        if (hlVar == null) {
            this.N = true;
        } else if (!z2) {
            hlVar.r.c(this);
        } else {
            hlVar.r.a(this);
        }
    }

    public void setReturnTransition(Object obj) {
        j().f = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        j().i = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        j().j = obj;
    }

    public void setTargetFragment(gj gjVar, int i) {
        hl hlVar;
        hl hlVar2 = this.D;
        if (gjVar != null) {
            hlVar = gjVar.D;
        } else {
            hlVar = null;
        }
        if (hlVar2 == null || hlVar == null || hlVar2 == hlVar) {
            gj gjVar2 = gjVar;
            while (gjVar2 != null) {
                if (gjVar2 != this) {
                    gjVar2 = gjVar2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + gjVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (gjVar == null) {
                this.t = null;
            } else if (this.D == null || gjVar.D == null) {
                this.t = null;
                this.s = gjVar;
                this.u = i;
                return;
            } else {
                this.t = gjVar.q;
            }
            this.s = null;
            this.u = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + gjVar + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        if (!this.U && z2 && this.m < 3 && this.D != null && isAdded() && this.aa) {
            hl hlVar = this.D;
            hlVar.a(hlVar.e(this));
        }
        this.U = z2;
        boolean z3 = false;
        if (this.m < 3 && !z2) {
            z3 = true;
        }
        this.T = z3;
        if (this.n != null) {
            this.p = Boolean.valueOf(z2);
        }
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = i;
        gx gxVar = this.E;
        if (gxVar != null) {
            gl glVar = ((gk) gxVar).a;
            glVar.f = true;
            if (i5 != -1) {
                try {
                    gl.a(i);
                    kf.a(glVar, intentSender, ((glVar.b(this) + 1) << 16) + ((char) i5), intent, i2, i3, i4, bundle);
                } finally {
                    glVar.f = false;
                }
            } else {
                kf.a(glVar, intentSender, -1, intent, i2, i3, i4, bundle);
                glVar.f = false;
            }
        } else {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
    }

    public void startPostponedEnterTransition() {
        if (this.V != null) {
            boolean z2 = j().m;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.q);
        sb.append(")");
        if (this.H != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.H));
        }
        if (this.J != null) {
            sb.append(" ");
            sb.append(this.J);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.V != null || i != 0) {
            j().c = i;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.F.a(parcelable);
            this.F.h();
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        gx gxVar = this.E;
        if (gxVar != null) {
            gk gkVar = (gk) gxVar;
            LayoutInflater cloneInContext = gkVar.a.getLayoutInflater().cloneInContext(gkVar.a);
            pg.a(cloneInContext, this.F.c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        this.Q = true;
        gx gxVar = this.E;
        Activity activity = gxVar != null ? gxVar.b : null;
        if (activity != null) {
            this.Q = false;
            onAttach(activity);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.Q = true;
        gx gxVar = this.E;
        Activity activity = gxVar != null ? gxVar.b : null;
        if (activity != null) {
            this.Q = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        gx gxVar = this.E;
        if (gxVar != null) {
            gxVar.a(this, intent, -1);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        gx gxVar = this.E;
        if (gxVar != null) {
            gxVar.a(this, intent, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public final void a(Animator animator) {
        j().b = animator;
    }

    /* access modifiers changed from: package-private */
    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.F.noteStateNotSaved();
        this.B = true;
        this.ad = new im();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.S = onCreateView;
        if (onCreateView != null) {
            this.ad.a();
            bu.a(this.S, this.ad);
            this.ae.b(this.ad);
        } else if (this.ad.a == null) {
            this.ad = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        j().a = view;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        j().n = z2;
    }
}

package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.AbsSavedState;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecyclerView extends ViewGroup implements pl {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new acc();
    public adn mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public acg mAdapter;
    public yn mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private acj mChildDrawingOrderCallback;
    public zv mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private ack mEdgeEffectFactory;
    boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public aaz mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private acx mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public aco mItemAnimator;
    private acm mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    public act mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final add mObserver;
    private List mOnChildAttachStateListeners;
    private acw mOnFlingListener;
    private final ArrayList mOnItemTouchListeners;
    final List mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public aax mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final adb mRecycler;
    public adc mRecyclerListener;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private acy mScrollListener;
    private List mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private pm mScrollingChildHelper;
    public final adi mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final adk mViewFlinger;
    private final afq mViewInfoProcessCallback;
    public final afr mViewInfoStore;

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = z;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = Build.VERSION.SDK_INT;
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(adl adl) {
        View view = adl.a;
        ViewParent parent = view.getParent();
        this.mRecycler.b(getChildViewHolder(view));
        if (adl.o()) {
            this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
        } else if (parent == this) {
            zv zvVar = this.mChildHelper;
            int a = zvVar.c.a(view);
            if (a >= 0) {
                zvVar.a.a(a);
                zvVar.a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else {
            this.mChildHelper.a(view, -1, true);
        }
    }

    private void animateChange(adl adl, adl adl2, acn acn, acn acn2, boolean z, boolean z2) {
        adl.a(false);
        if (z) {
            addAnimatingView(adl);
        }
        if (adl != adl2) {
            if (z2) {
                addAnimatingView(adl2);
            }
            adl.h = adl2;
            addAnimatingView(adl);
            this.mRecycler.b(adl);
            adl2.a(false);
            adl2.i = adl;
        }
        if (this.mItemAnimator.a(adl, adl2, acn, acn2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(adl adl) {
        WeakReference weakReference = adl.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != adl.a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            adl.b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(act.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((act) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            int i2 = Build.VERSION.SDK_INT;
            obtain.setContentChangeTypes(i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        afp afp;
        boolean z = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        adi adi = this.mState;
        if (!adi.j || !this.mItemsChanged) {
            z = false;
        }
        adi.h = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        adi.g = adi.k;
        adi.e = this.mAdapter.a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int a = this.mChildHelper.a();
            for (int i = 0; i < a; i++) {
                adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
                if (!childViewHolderInt.ax() && (!childViewHolderInt.k() || this.mAdapter.c)) {
                    aco.g(childViewHolderInt);
                    childViewHolderInt.r();
                    this.mViewInfoStore.a(childViewHolderInt, aco.h(childViewHolderInt));
                    if (this.mState.h && childViewHolderInt.u() && !childViewHolderInt.n() && !childViewHolderInt.ax() && !childViewHolderInt.k()) {
                        this.mViewInfoStore.a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            adi adi2 = this.mState;
            boolean z2 = adi2.f;
            adi2.f = false;
            this.mLayout.c(this.mRecycler, adi2);
            this.mState.f = z2;
            for (int i2 = 0; i2 < this.mChildHelper.a(); i2++) {
                adl childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.b(i2));
                if (!childViewHolderInt2.ax() && ((afp = (afp) this.mViewInfoStore.a.get(childViewHolderInt2)) == null || (afp.a & 4) == 0)) {
                    aco.g(childViewHolderInt2);
                    boolean a2 = childViewHolderInt2.a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
                    childViewHolderInt2.r();
                    acn h = aco.h(childViewHolderInt2);
                    if (!a2) {
                        afr afr = this.mViewInfoStore;
                        afp afp2 = (afp) afr.a.get(childViewHolderInt2);
                        if (afp2 == null) {
                            afp2 = afp.a();
                            afr.a.put(childViewHolderInt2, afp2);
                        }
                        afp2.a |= 2;
                        afp2.b = h;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, h);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.e();
        this.mState.e = this.mAdapter.a();
        this.mState.c = 0;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            int i = this.mAdapter.d;
            Parcelable parcelable = savedState.c;
            if (parcelable != null) {
                this.mLayout.a(parcelable);
            }
            this.mPendingSavedState = null;
        }
        adi adi = this.mState;
        adi.g = false;
        this.mLayout.c(this.mRecycler, adi);
        adi adi2 = this.mState;
        adi2.f = false;
        if (!adi2.j || this.mItemAnimator == null) {
            z = false;
        } else {
            z = true;
        }
        adi2.j = z;
        adi2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        adi adi = this.mState;
        adi.d = 1;
        if (adi.j) {
            for (int a = this.mChildHelper.a() - 1; a >= 0; a--) {
                adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(a));
                if (!childViewHolderInt.ax()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    acn f = aco.f();
                    f.a(childViewHolderInt);
                    adl adl = (adl) this.mViewInfoStore.b.a(changedHolderKey);
                    if (adl == null || adl.ax()) {
                        this.mViewInfoStore.b(childViewHolderInt, f);
                    } else {
                        boolean a2 = this.mViewInfoStore.a(adl);
                        boolean a3 = this.mViewInfoStore.a(childViewHolderInt);
                        if (a2 && adl == childViewHolderInt) {
                            this.mViewInfoStore.b(childViewHolderInt, f);
                        } else {
                            acn a4 = this.mViewInfoStore.a(adl, 4);
                            this.mViewInfoStore.b(childViewHolderInt, f);
                            acn a5 = this.mViewInfoStore.a(childViewHolderInt, 8);
                            if (a4 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, adl);
                            } else {
                                animateChange(adl, childViewHolderInt, a4, a5, a2, a3);
                            }
                        }
                    }
                }
            }
            afr afr = this.mViewInfoStore;
            afq afq = this.mViewInfoProcessCallback;
            for (int i = afr.a.h - 1; i >= 0; i--) {
                adl adl2 = (adl) afr.a.b(i);
                afp afp = (afp) afr.a.d(i);
                int i2 = afp.a;
                if ((i2 & 3) == 3) {
                    afq.a(adl2);
                } else if ((i2 & 1) != 0) {
                    acn acn = afp.b;
                    if (acn == null) {
                        afq.a(adl2);
                    } else {
                        afq.a(adl2, acn, afp.c);
                    }
                } else if ((i2 & 14) == 14) {
                    afq.b(adl2, afp.b, afp.c);
                } else if ((i2 & 12) == 12) {
                    afq.c(adl2, afp.b, afp.c);
                } else if ((i2 & 4) != 0) {
                    afq.a(adl2, afp.b, (acn) null);
                } else if ((i2 & 8) != 0) {
                    afq.b(adl2, afp.b, afp.c);
                }
                afp.a(afp);
            }
        }
        this.mLayout.b(this.mRecycler);
        adi adi2 = this.mState;
        adi2.b = adi2.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        adi2.j = false;
        adi2.k = false;
        this.mLayout.v = false;
        ArrayList arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        act act = this.mLayout;
        if (act.z) {
            act.y = 0;
            act.z = false;
            this.mRecycler.b();
        }
        this.mLayout.a(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        acx acx = this.mInterceptingOnItemTouchListener;
        if (acx != null) {
            acx.b(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() != 0) {
            return findInterceptingOnItemTouchListener(motionEvent);
        } else {
            return false;
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            acx acx = (acx) this.mOnItemTouchListeners.get(i);
            if (acx.a(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = acx;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.a();
        if (a != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < a; i3++) {
                adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i3));
                if (!childViewHolderInt.ax()) {
                    int c = childViewHolderInt.c();
                    if (c < i) {
                        i = c;
                    }
                    if (c > i2) {
                        i2 = c;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        adl findViewHolderForAdapterPosition;
        adi adi = this.mState;
        int i = adi.l;
        if (i == -1) {
            i = 0;
        }
        int a = adi.a();
        int i2 = i;
        while (i2 < a) {
            adl findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.a;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i) - 1;
        while (min >= 0 && (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) != null) {
            if (findViewHolderForAdapterPosition.a.hasFocusable()) {
                return findViewHolderForAdapterPosition.a;
            }
            min--;
        }
        return null;
    }

    public static adl getChildViewHolderInt(View view) {
        if (view != null) {
            return ((acu) view.getLayoutParams()).c;
        }
        return null;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        acu acu = (acu) view.getLayoutParams();
        Rect rect2 = acu.d;
        rect.set((view.getLeft() - rect2.left) - acu.leftMargin, (view.getTop() - rect2.top) - acu.topMargin, view.getRight() + rect2.right + acu.rightMargin, view.getBottom() + rect2.bottom + acu.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private pm getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new pm(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, adl adl, adl adl2) {
        int a = this.mChildHelper.a();
        for (int i = 0; i < a; i++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
            if (childViewHolderInt != adl && getChangedHolderKey(childViewHolderInt) == j) {
                acg acg = this.mAdapter;
                if (acg == null || !acg.c) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + adl + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + adl + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + adl2 + " cannot be found but it is necessary for " + adl + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.a();
        for (int i = 0; i < a; i++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i));
            if (childViewHolderInt != null && !childViewHolderInt.ax() && childViewHolderInt.u()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (qb.b(this) == 0) {
            qb.K(this);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new zv(new ace(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        if (this.mLayout.q() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if ((this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            i3 = ((this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        if ((this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c = 1;
        } else if ((this.mTempRect.bottom <= this.mTempRect2.bottom && this.mTempRect.top < this.mTempRect2.bottom) || this.mTempRect.top <= this.mTempRect2.top) {
            c = 0;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    return i3 < 0;
                }
                if (i == 33) {
                    return c < 0;
                }
                if (i == 66) {
                    return i3 > 0;
                }
                if (i == 130) {
                    return c > 0;
                }
                throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
            } else if (c <= 0 && (c != 0 || i3 * i2 < 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i3 * i2 > 0)) {
            return false;
        } else {
            return true;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void processAdapterUpdatesAndSetAnimationFlags() {
        /*
            r5 = this;
            boolean r0 = r5.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L_0x0012
            yn r0 = r5.mAdapterHelper
            r0.a()
            boolean r0 = r5.mDispatchItemsChangedEvent
            if (r0 == 0) goto L_0x0012
            act r0 = r5.mLayout
            r0.c()
        L_0x0012:
            boolean r0 = r5.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L_0x001e
            yn r0 = r5.mAdapterHelper
            r0.b()
            goto L_0x0023
        L_0x001e:
            yn r0 = r5.mAdapterHelper
            r0.e()
        L_0x0023:
            boolean r0 = r5.mItemsAddedOrRemoved
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r5.mItemsChanged
            if (r0 != 0) goto L_0x002f
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            adi r3 = r5.mState
            boolean r4 = r5.mFirstLayoutComplete
            if (r4 == 0) goto L_0x0050
            aco r4 = r5.mItemAnimator
            if (r4 == 0) goto L_0x0050
            boolean r4 = r5.mDataSetHasChangedAfterLayout
            if (r4 != 0) goto L_0x0046
            if (r0 != 0) goto L_0x0046
            act r4 = r5.mLayout
            boolean r4 = r4.v
            r4 = 0
            goto L_0x0051
        L_0x0046:
            if (r4 == 0) goto L_0x004e
            acg r4 = r5.mAdapter
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x0050
        L_0x004e:
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            r3.j = r4
            if (r4 != 0) goto L_0x0057
            r1 = 0
            goto L_0x0065
        L_0x0057:
            if (r0 == 0) goto L_0x0064
            boolean r0 = r5.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5.predictiveItemAnimationsEnabled()
            if (r0 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            r3.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.processAdapterUpdatesAndSetAnimationFlags():void");
    }

    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            rm.a(this.mLeftGlow, (-f2) / ((float) getWidth()), 1.0f - (f3 / ((float) getHeight())));
        } else if (f2 > 0.0f) {
            ensureRightGlow();
            rm.a(this.mRightGlow, f2 / ((float) getWidth()), f3 / ((float) getHeight()));
        } else {
            z = false;
        }
        if (f4 < 0.0f) {
            ensureTopGlow();
            rm.a(this.mTopGlow, (-f4) / ((float) getHeight()), f / ((float) getWidth()));
        } else if (f4 > 0.0f) {
            ensureBottomGlow();
            rm.a(this.mBottomGlow, f4 / ((float) getHeight()), 1.0f - (f / ((float) getWidth())));
        } else if (!z && f2 == 0.0f && f4 == 0.0f) {
            return;
        }
        qb.e(this);
    }

    private void recoverFocusFromState() {
        adl adl;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                long j = this.mState.m;
                View view = null;
                if (j == -1 || !this.mAdapter.c) {
                    adl = null;
                } else {
                    adl = findViewHolderForItemId(j);
                }
                if (adl != null && !this.mChildHelper.c(adl.a) && adl.a.hasFocusable()) {
                    view = adl.a;
                } else if (this.mChildHelper.a() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.n;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            qb.e(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof acu) {
            acu acu = (acu) layoutParams;
            if (!acu.e) {
                Rect rect = acu.d;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                this.mTempRect.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        act act = this.mLayout;
        Rect rect2 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        act.a(this, view, rect2, z2, z);
    }

    private void resetFocusInfo() {
        adi adi = this.mState;
        adi.m = -1;
        adi.l = -1;
        adi.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j;
        adl adl = null;
        if (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            adl = findContainingViewHolder(view);
        }
        if (adl != null) {
            adi adi = this.mState;
            if (this.mAdapter.c) {
                j = adl.e;
            } else {
                j = -1;
            }
            adi.m = j;
            adi.l = !this.mDataSetHasChangedAfterLayout ? adl.n() ? adl.d : adl.e() : -1;
            this.mState.n = getDeepestFocusedViewWithId(adl.a);
            return;
        }
        resetFocusInfo();
    }

    private void setAdapterInternal(acg acg, boolean z, boolean z2) {
        acg acg2 = this.mAdapter;
        if (acg2 != null) {
            acg2.b((aci) this.mObserver);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.a();
        acg acg3 = this.mAdapter;
        this.mAdapter = acg;
        if (acg != null) {
            acg.a((aci) this.mObserver);
            acg.a(this);
        }
        act act = this.mLayout;
        if (act != null) {
            act.a(acg3, this.mAdapter);
        }
        adb adb = this.mRecycler;
        acg acg4 = this.mAdapter;
        adb.a();
        ada d = adb.d();
        if (acg3 != null) {
            d.b();
        }
        if (!z && d.b == 0) {
            for (int i = 0; i < d.a.size(); i++) {
                ((acz) d.a.valueAt(i)).a.clear();
            }
        }
        if (acg4 != null) {
            d.a();
        }
        this.mState.f = true;
    }

    private void stopScrollersInternal() {
        adh adh;
        this.mViewFlinger.b();
        act act = this.mLayout;
        if (act != null && (adh = act.u) != null) {
            adh.a();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            qb.e(this);
        }
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        act act = this.mLayout;
        if (act == null || !act.a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(acq acq) {
        addItemDecoration(acq, -1);
    }

    public void addOnChildAttachStateChangeListener(acv acv) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(acv);
    }

    public void addOnItemTouchListener(acx acx) {
        this.mOnItemTouchListeners.add(acx);
    }

    public void addOnScrollListener(acy acy) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(acy);
    }

    public void animateAppearance(adl adl, acn acn, acn acn2) {
        adl.a(false);
        if (this.mItemAnimator.b(adl, acn, acn2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(adl adl, acn acn, acn acn2) {
        addAnimatingView(adl);
        adl.a(false);
        if (this.mItemAnimator.a(adl, acn, acn2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
            }
        } else if (str == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        } else {
            throw new IllegalStateException(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(adl adl) {
        aco aco = this.mItemAnimator;
        return aco == null || aco.a(adl, adl.r());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof acu) && this.mLayout.a((acu) layoutParams);
    }

    public void clearOldPositions() {
        int b = this.mChildHelper.b();
        for (int i = 0; i < b; i++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i));
            if (!childViewHolderInt.ax()) {
                childViewHolderInt.aw();
            }
        }
        adb adb = this.mRecycler;
        int size = adb.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((adl) adb.c.get(i2)).aw();
        }
        int size2 = adb.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((adl) adb.a.get(i3)).aw();
        }
        ArrayList arrayList = adb.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((adl) adb.b.get(i4)).aw();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        act act = this.mLayout;
        if (act == null || !act.g()) {
            return 0;
        }
        return this.mLayout.d(this.mState);
    }

    public int computeHorizontalScrollOffset() {
        act act = this.mLayout;
        if (act == null || !act.g()) {
            return 0;
        }
        return this.mLayout.b(this.mState);
    }

    public int computeHorizontalScrollRange() {
        act act = this.mLayout;
        if (act == null || !act.g()) {
            return 0;
        }
        return this.mLayout.f(this.mState);
    }

    public int computeVerticalScrollExtent() {
        act act = this.mLayout;
        if (act == null || !act.h()) {
            return 0;
        }
        return this.mLayout.e(this.mState);
    }

    public int computeVerticalScrollOffset() {
        act act = this.mLayout;
        if (act == null || !act.h()) {
            return 0;
        }
        return this.mLayout.c(this.mState);
    }

    public int computeVerticalScrollRange() {
        act act = this.mLayout;
        if (act == null || !act.h()) {
            return 0;
        }
        return this.mLayout.g(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            qb.e(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            mv.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            mv.a();
        } else if (!this.mAdapterHelper.d()) {
        } else {
            if (this.mAdapterHelper.a(4) && !this.mAdapterHelper.a(11)) {
                mv.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.b();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.c();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                mv.a();
            } else if (this.mAdapterHelper.d()) {
                mv.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                mv.a();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(act.a(i, getPaddingLeft() + getPaddingRight(), qb.k(this)), act.a(i2, getPaddingTop() + getPaddingBottom(), qb.l(this)));
    }

    public void dispatchChildAttached(View view) {
        adl childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        acg acg = this.mAdapter;
        if (!(acg == null || childViewHolderInt == null)) {
            acg.b(childViewHolderInt);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((acv) this.mOnChildAttachStateListeners.get(size)).a();
            }
        }
    }

    public void dispatchChildDetached(View view) {
        getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((acv) this.mOnChildAttachStateListeners.get(size)).b();
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout != null) {
            adi adi = this.mState;
            adi.i = false;
            if (adi.d == 1) {
                dispatchLayoutStep1();
                this.mLayout.b(this);
                dispatchLayoutStep2();
            } else {
                yn ynVar = this.mAdapterHelper;
                if ((ynVar.b.isEmpty() || ynVar.a.isEmpty()) && this.mLayout.C == getWidth() && this.mLayout.D == getHeight()) {
                    this.mLayout.b(this);
                } else {
                    this.mLayout.b(this);
                    dispatchLayoutStep2();
                }
            }
            dispatchLayoutStep3();
        } else {
            Log.e(TAG, "No layout manager attached; skipping layout");
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i, i2, iArr, iArr2);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void dispatchOnScrollStateChanged(int i) {
        onScrollStateChanged(i);
        acy acy = this.mScrollListener;
        if (acy != null) {
            acy.a(this, i);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((acy) this.mScrollListeners.get(size)).a(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        acy acy = this.mScrollListener;
        if (acy != null) {
            acy.a(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((acy) this.mScrollListeners.get(size)).a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            adl adl = (adl) this.mPendingAccessibilityImportanceChange.get(size);
            if (adl.a.getParent() == this && !adl.ax() && (i = adl.p) != -1) {
                qb.b(adl.a, i);
                adl.p = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((acq) this.mItemDecorations.get(i2)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i = getPaddingBottom();
            } else {
                i = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.b())) {
            qb.e(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = ack.a(this);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = ack.a(this);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = ack.a(this);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = ack.a(this);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public final void fillRemainingScrollValues(adi adi) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.c;
            adi.o = overScroller.getFinalX() - overScroller.getCurrX();
            adi.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        adi.o = 0;
        adi.p = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.a() - 1; a >= 0; a--) {
            View b = this.mChildHelper.b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY && f2 <= ((float) b.getBottom()) + translationY) {
                return b;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public adl findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView != null) {
            return getChildViewHolder(findContainingItemView);
        }
        return null;
    }

    public adl findViewHolderForAdapterPosition(int i) {
        adl adl = null;
        if (!this.mDataSetHasChangedAfterLayout) {
            int b = this.mChildHelper.b();
            for (int i2 = 0; i2 < b; i2++) {
                adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
                if (childViewHolderInt != null && !childViewHolderInt.n() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                    if (!this.mChildHelper.c(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    adl = childViewHolderInt;
                }
            }
        }
        return adl;
    }

    public adl findViewHolderForItemId(long j) {
        acg acg = this.mAdapter;
        adl adl = null;
        if (acg != null && acg.c) {
            int b = this.mChildHelper.b();
            for (int i = 0; i < b; i++) {
                adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i));
                if (childViewHolderInt != null && !childViewHolderInt.n() && childViewHolderInt.e == j) {
                    if (!this.mChildHelper.c(childViewHolderInt.a)) {
                        return childViewHolderInt;
                    }
                    adl = childViewHolderInt;
                }
            }
        }
        return adl;
    }

    public adl findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public adl findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        r13 = r10 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            act r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 != 0) goto L_0x0147
            boolean r1 = r1.g()
            act r3 = r0.mLayout
            boolean r3 = r3.h()
            if (r1 == 0) goto L_0x002a
            int r4 = java.lang.Math.abs(r18)
            int r5 = r0.mMinFlingVelocity
            if (r4 < r5) goto L_0x002a
            r4 = r18
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r3 == 0) goto L_0x0038
            int r5 = java.lang.Math.abs(r19)
            int r6 = r0.mMinFlingVelocity
            if (r5 < r6) goto L_0x0038
            r5 = r19
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r4 == 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            if (r5 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float r6 = (float) r4
            float r7 = (float) r5
            boolean r8 = r0.dispatchNestedPreFling(r6, r7)
            if (r8 != 0) goto L_0x0147
            r8 = 1
            r0.dispatchNestedFling(r6, r7, r8)
            acw r6 = r0.mOnFlingListener
            if (r6 == 0) goto L_0x00ed
            android.support.v7.widget.RecyclerView r7 = r6.a
            act r7 = r7.getLayoutManager()
            if (r7 == 0) goto L_0x00ed
            android.support.v7.widget.RecyclerView r9 = r6.a
            acg r9 = r9.getAdapter()
            if (r9 == 0) goto L_0x00ed
            android.support.v7.widget.RecyclerView r9 = r6.a
            int r9 = r9.getMinFlingVelocity()
            int r10 = java.lang.Math.abs(r5)
            if (r10 > r9) goto L_0x0071
            int r10 = java.lang.Math.abs(r4)
            if (r10 <= r9) goto L_0x00ed
        L_0x0071:
            boolean r9 = r7 instanceof defpackage.adg
            if (r9 == 0) goto L_0x00ed
            aem r9 = new aem
            android.support.v7.widget.RecyclerView r10 = r6.a
            android.content.Context r10 = r10.getContext()
            r9.<init>(r6, r10)
            int r10 = r7.y()
            r11 = -1
            if (r10 == 0) goto L_0x00e2
            android.view.View r12 = r6.a(r7)
            if (r12 == 0) goto L_0x00e2
            int r12 = defpackage.act.j(r12)
            if (r12 == r11) goto L_0x00e2
            int r13 = r10 + -1
            r14 = r7
            adg r14 = (defpackage.adg) r14
            android.graphics.PointF r14 = r14.c(r13)
            if (r14 == 0) goto L_0x00e2
            boolean r15 = r7.g()
            r16 = 0
            if (r15 == 0) goto L_0x00b6
            abz r15 = r6.c(r7)
            int r15 = r6.a(r7, r15, r4, r2)
            float r8 = r14.x
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b7
            int r15 = -r15
            goto L_0x00b7
        L_0x00b6:
            r15 = 0
        L_0x00b7:
            boolean r8 = r7.h()
            if (r8 == 0) goto L_0x00cd
            abz r8 = r6.b(r7)
            int r6 = r6.a(r7, r8, r2, r5)
            float r8 = r14.y
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ce
            int r6 = -r6
            goto L_0x00ce
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            boolean r8 = r7.h()
            if (r8 != 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r15 = r6
        L_0x00d6:
            if (r15 == 0) goto L_0x00e2
            int r12 = r12 + r15
            if (r12 < 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r12 = 0
        L_0x00dd:
            if (r12 >= r10) goto L_0x00e1
            r13 = r12
            goto L_0x00e3
        L_0x00e1:
            goto L_0x00e3
        L_0x00e2:
            r13 = -1
        L_0x00e3:
            if (r13 != r11) goto L_0x00e6
            goto L_0x00ed
        L_0x00e6:
            r9.a = r13
            r7.a((defpackage.adh) r9)
            r1 = 1
            return r1
        L_0x00ed:
            if (r3 == 0) goto L_0x00f2
            r1 = r1 | 2
            goto L_0x00f3
        L_0x00f2:
        L_0x00f3:
            r3 = 1
            r0.startNestedScroll(r1, r3)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r9 = java.lang.Math.max(r3, r1)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r1)
            adk r1 = r0.mViewFlinger
            android.support.v7.widget.RecyclerView r3 = r1.e
            r4 = 2
            r3.setScrollState(r4)
            r1.b = r2
            r1.a = r2
            android.view.animation.Interpolator r2 = r1.d
            android.view.animation.Interpolator r3 = sQuinticInterpolator
            if (r2 == r3) goto L_0x0131
            r1.d = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.support.v7.widget.RecyclerView r3 = r1.e
            android.content.Context r3 = r3.getContext()
            android.view.animation.Interpolator r4 = sQuinticInterpolator
            r2.<init>(r3, r4)
            r1.c = r2
        L_0x0131:
            android.widget.OverScroller r6 = r1.c
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a()
            r1 = 1
            return r1
        L_0x0147:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View c = this.mLayout.c(view, i);
        if (c != null) {
            return c;
        }
        boolean z5 = true;
        if (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            if (this.mLayout.h()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.g()) {
                if (this.mLayout.q() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!(z3 ^ z4)) {
                    i2 = 17;
                } else {
                    i2 = 66;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                    z2 = z5;
                } else {
                    z2 = z5;
                }
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        } else {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus == null && z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return !isPreferredNextFocus(view, view2, i) ? super.focusSearch(view, i) : view2;
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        act act = this.mLayout;
        if (act != null) {
            return act.a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        act act = this.mLayout;
        if (act != null) {
            return act.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public acg getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(adl adl) {
        if (adl.a(524) || !adl.m()) {
            return -1;
        }
        yn ynVar = this.mAdapterHelper;
        int i = adl.c;
        int size = ynVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ym ymVar = (ym) ynVar.a.get(i2);
            int i3 = ymVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = ymVar.b;
                    if (i4 <= i) {
                        int i5 = ymVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = ymVar.b;
                    if (i6 == i) {
                        i = ymVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (ymVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (ymVar.b <= i) {
                i += ymVar.d;
            }
        }
        return i;
    }

    public int getBaseline() {
        if (this.mLayout != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(adl adl) {
        return !this.mAdapter.c ? (long) adl.c : adl.e;
    }

    public int getChildAdapterPosition(View view) {
        adl childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.e();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        acj acj = this.mChildDrawingOrderCallback;
        if (acj == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return acj.a();
    }

    public long getChildItemId(View view) {
        adl childViewHolderInt;
        acg acg = this.mAdapter;
        if (acg == null || !acg.c || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.e;
    }

    public int getChildLayoutPosition(View view) {
        adl childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.c();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public adl getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public adn getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public ack getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public aco getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        acu acu = (acu) view.getLayoutParams();
        if (!acu.e) {
            return acu.d;
        }
        if (this.mState.g && (acu.b() || acu.c.k())) {
            return acu.d;
        }
        Rect rect = acu.d;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((acq) this.mItemDecorations.get(i)).a(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        acu.e = false;
        return rect;
    }

    public acq getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (acq) this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public act getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public acw getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public ada getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.d();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new yn(new acf(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new aas(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            act act = this.mLayout;
            if (act != null) {
                act.a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        aco aco = this.mItemAnimator;
        return aco != null && aco.b();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().a;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.d(i);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.b();
        for (int i = 0; i < b; i++) {
            ((acu) this.mChildHelper.c(i).getLayoutParams()).e = true;
        }
        adb adb = this.mRecycler;
        int size = adb.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            acu acu = (acu) ((adl) adb.c.get(i2)).a.getLayoutParams();
            if (acu != null) {
                acu.e = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.b();
        for (int i = 0; i < b; i++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i));
            if (childViewHolderInt != null && !childViewHolderInt.ax()) {
                childViewHolderInt.b(6);
            }
        }
        markItemDecorInsetsDirty();
        adb adb = this.mRecycler;
        int size = adb.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            adl adl = (adl) adb.c.get(i2);
            if (adl != null) {
                adl.b(6);
                adl.a((Object) null);
            }
        }
        acg acg = adb.i.mAdapter;
        if (acg == null || !acg.c) {
            adb.c();
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int a = this.mChildHelper.a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int a = this.mChildHelper.a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.b(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.b();
        for (int i3 = 0; i3 < b; i3++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i3));
            if (childViewHolderInt != null && !childViewHolderInt.ax() && childViewHolderInt.c >= i) {
                childViewHolderInt.a(i2, false);
                this.mState.f = true;
            }
        }
        adb adb = this.mRecycler;
        int size = adb.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            adl adl = (adl) adb.c.get(i4);
            if (adl != null && adl.c >= i) {
                adl.a(i2, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int b = this.mChildHelper.b();
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        if (i < i2) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i < i2) {
            i5 = i;
        } else {
            i5 = i2;
        }
        for (int i8 = 0; i8 < b; i8++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.c) >= i5 && i7 <= i4) {
                if (i7 == i) {
                    childViewHolderInt.a(i2 - i, false);
                } else {
                    childViewHolderInt.a(i3, false);
                }
                this.mState.f = true;
            }
        }
        adb adb = this.mRecycler;
        int size = adb.c.size();
        for (int i9 = 0; i9 < size; i9++) {
            adl adl = (adl) adb.c.get(i9);
            if (adl != null && (i6 = adl.c) >= i5 && i6 <= i4) {
                if (i6 == i) {
                    adl.a(i2 - i, false);
                } else {
                    adl.a(i3, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.b();
        for (int i4 = 0; i4 < b; i4++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i4));
            if (childViewHolderInt != null && !childViewHolderInt.ax()) {
                int i5 = childViewHolderInt.c;
                if (i5 >= i3) {
                    childViewHolderInt.a(-i2, z);
                    this.mState.f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.b(8);
                    childViewHolderInt.a(-i2, z);
                    childViewHolderInt.c = i - 1;
                    this.mState.f = true;
                }
            }
        }
        adb adb = this.mRecycler;
        for (int size = adb.c.size() - 1; size >= 0; size--) {
            adl adl = (adl) adb.c.get(size);
            if (adl != null) {
                int i6 = adl.c;
                if (i6 >= i3) {
                    adl.a(-i2, z);
                } else if (i6 >= i) {
                    adl.b(8);
                    adb.c(size);
                }
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            aaz aaz = (aaz) aaz.a.get();
            this.mGapWorker = aaz;
            if (aaz == null) {
                this.mGapWorker = new aaz();
                Display F = qb.F(this);
                float f = 60.0f;
                if (!isInEditMode() && F != null) {
                    float refreshRate = F.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.mGapWorker.d = (long) (1.0E9f / f);
                aaz.a.set(this.mGapWorker);
            }
            this.mGapWorker.b.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        aaz aaz;
        super.onDetachedFromWindow();
        aco aco = this.mItemAnimator;
        if (aco != null) {
            aco.d();
        }
        stopScroll();
        this.mIsAttached = false;
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        afp.b();
        if (ALLOW_THREAD_GAP_WORK && (aaz = this.mGapWorker) != null) {
            aaz.b.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((acq) this.mItemDecorations.get(i)).a(canvas, this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.mLayout.h()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                f = this.mLayout.g() ? motionEvent.getAxisValue(10) : 0.0f;
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    f = motionEvent.getAxisValue(26);
                    if (this.mLayout.h()) {
                        f2 = -f;
                        f = 0.0f;
                    } else if (this.mLayout.g()) {
                        f2 = 0.0f;
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
            }
            if (!(f2 == 0.0f && f == 0.0f)) {
                scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        if (r0 != false) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.mLayoutSuppressed
            r1 = 0
            if (r0 != 0) goto L_0x0126
            r0 = 0
            r8.mInterceptingOnItemTouchListener = r0
            boolean r0 = r8.findInterceptingOnItemTouchListener(r9)
            r2 = 1
            if (r0 != 0) goto L_0x0122
            act r0 = r8.mLayout
            if (r0 == 0) goto L_0x0121
            boolean r0 = r0.g()
            act r3 = r8.mLayout
            boolean r3 = r3.h()
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            if (r4 != 0) goto L_0x0027
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.mVelocityTracker = r4
        L_0x0027:
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto L_0x00d8
            if (r4 == r2) goto L_0x00cf
            if (r4 == r6) goto L_0x006e
            r0 = 3
            if (r4 == r0) goto L_0x0069
            r0 = 5
            if (r4 == r0) goto L_0x004d
            r0 = 6
            if (r4 == r0) goto L_0x0048
            goto L_0x011b
        L_0x0048:
            r8.onPointerUp(r9)
            goto L_0x011b
        L_0x004d:
            int r0 = r9.getPointerId(r5)
            r8.mScrollPointerId = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.mLastTouchX = r0
            r8.mInitialTouchX = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            goto L_0x011b
        L_0x0069:
            r8.cancelScroll()
            goto L_0x011b
        L_0x006e:
            int r4 = r8.mScrollPointerId
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x0094
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.mScrollPointerId
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L_0x0094:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.mScrollState
            if (r4 == r2) goto L_0x011b
            int r4 = r8.mInitialTouchX
            int r4 = r5 - r4
            int r6 = r8.mInitialTouchY
            int r6 = r9 - r6
            if (r0 == 0) goto L_0x00ba
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.mTouchSlop
            if (r0 <= r4) goto L_0x00ba
            r8.mLastTouchX = r5
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r3 == 0) goto L_0x00c8
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.mTouchSlop
            if (r3 <= r4) goto L_0x00c8
            r8.mLastTouchY = r9
            goto L_0x00ca
        L_0x00c8:
            if (r0 == 0) goto L_0x011b
        L_0x00ca:
            r8.setScrollState(r2)
            goto L_0x011b
        L_0x00cf:
            android.view.VelocityTracker r9 = r8.mVelocityTracker
            r9.clear()
            r8.stopNestedScroll(r1)
            goto L_0x011b
        L_0x00d8:
            boolean r4 = r8.mIgnoreMotionEventTillDown
            if (r4 != 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r8.mIgnoreMotionEventTillDown = r1
        L_0x00df:
            int r4 = r9.getPointerId(r1)
            r8.mScrollPointerId = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.mLastTouchX = r4
            r8.mInitialTouchX = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            int r9 = r8.mScrollState
            if (r9 != r6) goto L_0x010b
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.stopNestedScroll(r2)
        L_0x010b:
            int[] r9 = r8.mNestedOffsets
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L_0x0116
            r0 = r0 | 2
            goto L_0x0117
        L_0x0116:
        L_0x0117:
            r8.startNestedScroll(r0, r1)
        L_0x011b:
            int r9 = r8.mScrollState
            if (r9 != r2) goto L_0x0120
            return r2
        L_0x0120:
            return r1
        L_0x0121:
            return r1
        L_0x0122:
            r8.cancelScroll()
            return r2
        L_0x0126:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mv.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        mv.a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        act act = this.mLayout;
        if (act == null) {
            defaultOnMeasure(i, i2);
        } else if (act.e()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.a(this.mRecycler, this.mState, i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.mAdapter != null) {
                if (this.mState.d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.g(i, i2);
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.h(i, i2);
                if (this.mLayout.l()) {
                    this.mLayout.g(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
                    this.mState.i = true;
                    dispatchLayoutStep2();
                    this.mLayout.h(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.a(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                adi adi = this.mState;
                if (!adi.k) {
                    this.mAdapterHelper.e();
                    this.mState.g = false;
                } else {
                    adi.g = true;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            acg acg = this.mAdapter;
            if (acg != null) {
                this.mState.e = acg.a();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.a(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.g = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (!isComputingLayout()) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.b);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 == null) {
            act act = this.mLayout;
            parcelable = act != null ? act.f() : null;
        } else {
            parcelable = savedState2.c;
        }
        savedState.c = parcelable;
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = 0;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (!dispatchToOnItemTouchListeners(motionEvent)) {
            act act = this.mLayout;
            if (act == null) {
                return false;
            }
            boolean g = act.g();
            boolean h = this.mLayout.h();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.mNestedOffsets;
                iArr[1] = 0;
                iArr[0] = 0;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int[] iArr2 = this.mNestedOffsets;
            obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            if (actionMasked == 0) {
                this.mScrollPointerId = motionEvent2.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x;
                this.mInitialTouchX = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y;
                this.mInitialTouchY = y;
                if (h) {
                    g |= true;
                }
                startNestedScroll(g ? 1 : 0, 0);
            } else if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.mMaxFlingVelocity);
                if (g) {
                    f = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
                } else {
                    f = 0.0f;
                }
                if (h) {
                    f2 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
                } else {
                    f2 = 0.0f;
                }
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x2 = (int) (motionEvent2.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent2.getY(findPointerIndex) + 0.5f);
                int i6 = this.mLastTouchX - x2;
                int i7 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (!g) {
                        z = false;
                    } else {
                        if (i6 <= 0) {
                            i6 = Math.min(0, i6 + this.mTouchSlop);
                        } else {
                            i6 = Math.max(0, i6 - this.mTouchSlop);
                        }
                        z = i6 != 0;
                    }
                    if (h) {
                        if (i7 <= 0) {
                            i7 = Math.min(0, i7 + this.mTouchSlop);
                        } else {
                            i7 = Math.max(0, i7 - this.mTouchSlop);
                        }
                        if (i7 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                }
                int i8 = i6;
                int i9 = i7;
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (!g) {
                        i = 0;
                    } else {
                        i = i8;
                    }
                    if (!h) {
                        i2 = 0;
                    } else {
                        i2 = i9;
                    }
                    if (dispatchNestedPreScroll(i, i2, iArr3, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        i8 -= iArr4[0];
                        int i10 = i9 - iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i11 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i11 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                        i3 = i10;
                    } else {
                        i3 = i9;
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (!g) {
                        i4 = 0;
                    } else {
                        i4 = i8;
                    }
                    if (h) {
                        i5 = i3;
                    }
                    if (scrollByInternal(i4, i5, motionEvent2)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    aaz aaz = this.mGapWorker;
                    if (!(aaz == null || (i8 == 0 && i3 == 0))) {
                        aaz.a(this, i8, i3);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent2.getPointerId(actionIndex);
                int x3 = (int) (motionEvent2.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent2.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return true;
        }
        cancelScroll();
        return true;
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            qb.a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(adl adl, acn acn) {
        adl.a(0, (int) FragmentTransaction.TRANSIT_EXIT_MASK);
        if (this.mState.h && adl.u() && !adl.n() && !adl.ax()) {
            this.mViewInfoStore.a(getChangedHolderKey(adl), adl);
        }
        this.mViewInfoStore.a(adl, acn);
    }

    public void removeAndRecycleViews() {
        aco aco = this.mItemAnimator;
        if (aco != null) {
            aco.d();
        }
        act act = this.mLayout;
        if (act != null) {
            act.c(this.mRecycler);
            this.mLayout.b(this.mRecycler);
        }
        this.mRecycler.a();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        zv zvVar = this.mChildHelper;
        int a = zvVar.c.a(view);
        boolean z = true;
        if (a == -1) {
            zvVar.d(view);
        } else if (zvVar.a.c(a)) {
            zvVar.a.d(a);
            zvVar.d(view);
            zvVar.c.a(a);
        } else {
            z = false;
        }
        if (z) {
            adl childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.b(childViewHolderInt);
            this.mRecycler.a(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    public void removeDetachedView(View view, boolean z) {
        adl childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.o()) {
                childViewHolderInt.j();
            } else if (!childViewHolderInt.ax()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(acq acq) {
        boolean z;
        act act = this.mLayout;
        if (act != null) {
            act.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(acq);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(acv acv) {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(acv);
        }
    }

    public void removeOnItemTouchListener(acx acx) {
        this.mOnItemTouchListeners.remove(acx);
        if (this.mInterceptingOnItemTouchListener == acx) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(acy acy) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(acy);
        }
    }

    public void repositionShadowingViews() {
        adl adl;
        int a = this.mChildHelper.a();
        for (int i = 0; i < a; i++) {
            View b = this.mChildHelper.b(i);
            adl childViewHolder = getChildViewHolder(b);
            if (!(childViewHolder == null || (adl = childViewHolder.i) == null)) {
                View view = adl.a;
                int left = b.getLeft();
                int top = b.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.a(this, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((acx) this.mOnItemTouchListeners.get(i)).c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int b = this.mChildHelper.b();
        for (int i = 0; i < b; i++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i));
            if (!childViewHolderInt.ax() && childViewHolderInt.d == -1) {
                childViewHolderInt.d = childViewHolderInt.c;
            }
        }
    }

    public void scrollBy(int i, int i2) {
        act act = this.mLayout;
        if (act == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean g = act.g();
            boolean h = this.mLayout.h();
            if (g || h) {
                if (!g) {
                    i = 0;
                }
                if (!h) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i4 - i11;
        int i13 = iArr4[1];
        int i14 = i3 - i13;
        boolean z = i11 != 0 ? true : i13 != 0;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (!(motionEvent == null || (motionEvent.getSource() & FragmentTransaction.TRANSIT_FRAGMENT_CLOSE) == 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i14);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        mv.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i3 = this.mLayout.a(i, this.mRecycler, this.mState);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.mLayout.b(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        mv.a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            act act = this.mLayout;
            if (act == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            act.d(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(adn adn) {
        this.mAccessibilityDelegate = adn;
        qb.a((View) this, (oz) adn);
    }

    public void setAdapter(acg acg) {
        setLayoutFrozen(false);
        setAdapterInternal(acg, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(acj acj) {
        if (acj != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = acj;
            setChildrenDrawingOrderEnabled(acj != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(adl adl, int i) {
        if (isComputingLayout()) {
            adl.p = i;
            this.mPendingAccessibilityImportanceChange.add(adl);
            return false;
        }
        qb.b(adl.a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(ack ack) {
        ot.a((Object) ack);
        this.mEdgeEffectFactory = ack;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(aco aco) {
        aco aco2 = this.mItemAnimator;
        if (aco2 != null) {
            aco2.d();
            this.mItemAnimator.h = null;
        }
        this.mItemAnimator = aco;
        if (aco != null) {
            aco.h = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        adb adb = this.mRecycler;
        adb.e = i;
        adb.b();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(act act) {
        if (act != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                aco aco = this.mItemAnimator;
                if (aco != null) {
                    aco.d();
                }
                this.mLayout.c(this.mRecycler);
                this.mLayout.b(this.mRecycler);
                this.mRecycler.a();
                this.mLayout.a((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.a();
            }
            zv zvVar = this.mChildHelper;
            zvVar.a.a();
            for (int size = zvVar.b.size() - 1; size >= 0; size--) {
                zvVar.c.b((View) zvVar.b.get(size));
                zvVar.b.remove(size);
            }
            ace ace = zvVar.c;
            int a = ace.a();
            for (int i = 0; i < a; i++) {
                View b = ace.b(i);
                ace.a.dispatchChildDetached(b);
                b.clearAnimation();
            }
            ace.a.removeAllViews();
            this.mLayout = act;
            if (act != null) {
                if (act.r == null) {
                    this.mLayout.a(this);
                } else {
                    throw new IllegalArgumentException("LayoutManager " + act + " is already attached to a RecyclerView:" + act.r.exceptionLabel());
                }
            }
            this.mRecycler.b();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().a(z);
    }

    public void setOnFlingListener(acw acw) {
        this.mOnFlingListener = acw;
    }

    @Deprecated
    public void setOnScrollListener(acy acy) {
        this.mScrollListener = acy;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(ada ada) {
        adb adb = this.mRecycler;
        ada ada2 = adb.g;
        if (ada2 != null) {
            ada2.b();
        }
        adb.g = ada;
        if (adb.g != null && adb.i.getAdapter() != null) {
            adb.g.a();
        }
    }

    public void setRecyclerListener(adc adc) {
        this.mRecyclerListener = adc;
    }

    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(adj adj) {
        this.mRecycler.h = adj;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            int i3 = Build.VERSION.SDK_INT;
            i = accessibilityEvent.getContentChangeTypes();
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            act act = this.mLayout;
            if (act == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                act.a(this, i);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().b(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        int i = this.mInterceptRequestLayoutDepth;
        if (i <= 0) {
            this.mInterceptRequestLayoutDepth = 1;
            i = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (i == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().b();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(acg acg, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(acg, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int b = this.mChildHelper.b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View c = this.mChildHelper.c(i6);
            adl childViewHolderInt = getChildViewHolderInt(c);
            if (childViewHolderInt != null && !childViewHolderInt.ax() && (i4 = childViewHolderInt.c) >= i && i4 < i5) {
                childViewHolderInt.b(2);
                childViewHolderInt.a(obj);
                ((acu) c.getLayoutParams()).e = true;
            }
        }
        adb adb = this.mRecycler;
        for (int size = adb.c.size() - 1; size >= 0; size--) {
            adl adl = (adl) adb.c.get(size);
            if (adl != null && (i3 = adl.c) >= i && i3 < i5) {
                adl.b(2);
                adb.c(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public void addItemDecoration(acq acq, int i) {
        act act = this.mLayout;
        if (act != null) {
            act.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(acq);
        } else {
            this.mItemDecorations.add(i, acq);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().a(i, i2, iArr, iArr2, i3);
    }

    public adl findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.b();
        adl adl = null;
        for (int i2 = 0; i2 < b; i2++) {
            adl childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.n()) {
                if (!z) {
                    if (childViewHolderInt.c() != i) {
                        continue;
                    }
                } else if (childViewHolderInt.c != i) {
                    continue;
                }
                if (!this.mChildHelper.c(childViewHolderInt.a)) {
                    return childViewHolderInt;
                }
                adl = childViewHolderInt;
            }
        }
        return adl;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().a(i);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i <= 0) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().a(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().c(i);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new ade();
        Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? act.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aax aax;
        this.mObserver = new add(this);
        this.mRecycler = new adb(this);
        this.mViewInfoStore = new afr();
        this.mUpdateChildViewsRunnable = new aca(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new ack();
        this.mItemAnimator = new aai();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new adk(this);
        if (ALLOW_THREAD_GAP_WORK) {
            aax = new aax();
        } else {
            aax = null;
        }
        this.mPrefetchRegistry = aax;
        this.mState = new adi();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new acp(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new acb(this);
        this.mViewInfoProcessCallback = new acd(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = qc.a(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = qc.b(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.h = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (qb.f(this) == 0) {
            qb.b((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new adn(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uz.a, i, 0);
        qb.a(this, context, uz.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
        qb.a(this, context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().a(i, i2, i3, i4, iArr);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        act act = this.mLayout;
        if (act != null) {
            return act.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().a(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        act act = this.mLayout;
        if (act == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!act.g()) {
                i = 0;
            }
            if (!this.mLayout.h()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.a(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }
}

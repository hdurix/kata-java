package com.github.hdurix.common.domain;

import static org.assertj.core.api.Assertions.*;

import com.github.hdurix.UnitTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@UnitTest
class KataCollectionsTest {

  @Nested
  @DisplayName("Collections")
  class KataCollectionsCollectionsTest {

    @Test
    void shouldGetEmptyImmutableCollectionFromNullCollection() {
      Collection<Object> input = null;
      Collection<Object> collection = KataCollections.immutable(input);

      assertThat(collection).isEmpty();
      assertThatThrownBy(() -> collection.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void shouldGetImmutableCollectionFromMutableCollection() {
      Collection<String> input = new ArrayList<>();
      input.add("value");
      Collection<String> collection = KataCollections.immutable(input);

      assertThat(collection).containsExactly("value");
      assertThatThrownBy(() -> collection.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }
  }

  @Nested
  @DisplayName("Set")
  class KataCollectionsSetTest {

    @Test
    void shouldGetEmptyImmutableCollectionFromNullCollection() {
      Set<Object> input = null;
      Set<Object> set = KataCollections.immutable(input);

      assertThat(set).isEmpty();
      assertThatThrownBy(() -> set.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void shouldGetImmutableCollectionFromMutableCollection() {
      Set<String> input = new HashSet<>();
      input.add("value");
      Set<String> set = KataCollections.immutable(input);

      assertThat(set).containsExactly("value");
      assertThatThrownBy(() -> set.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }
  }

  @Nested
  @DisplayName("List")
  class KataCollectionsListTest {

    @Test
    void shouldGetEmptyImmutableCollectionFromNullCollection() {
      List<Object> input = null;
      List<Object> list = KataCollections.immutable(input);

      assertThat(list).isEmpty();
      assertThatThrownBy(() -> list.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void shouldGetImmutableCollectionFromMutableCollection() {
      List<String> input = new ArrayList<>();
      input.add("value");
      List<String> list = KataCollections.immutable(input);

      assertThat(list).containsExactly("value");
      assertThatThrownBy(() -> list.clear()).isExactlyInstanceOf(UnsupportedOperationException.class);
    }
  }
}

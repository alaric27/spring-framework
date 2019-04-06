<?xml version="1.0" encoding="UTF-8"?>
<Diagram>
  <ID>JAVA</ID>
  <OriginalElement>org.springframework.beans.factory.config.BeanFactoryPostProcessor</OriginalElement>
  <nodes>
    <node x="515.0" y="79.0">org.springframework.beans.factory.annotation.CustomAutowireConfigurer</node>
    <node x="11.0" y="158.0">org.springframework.context.annotation.ConfigurationClassPostProcessor</node>
    <node x="402.5" y="0.0">org.springframework.beans.factory.config.BeanFactoryPostProcessor</node>
    <node x="298.0" y="79.0">org.springframework.context.weaving.AspectJWeavingEnabler</node>
    <node x="0.0" y="79.0">org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor</node>
    <node x="752.0" y="79.0">org.springframework.beans.factory.config.CustomEditorConfigurer</node>
  </nodes>
  <notes />
  <edges>
    <edge source="org.springframework.beans.factory.annotation.CustomAutowireConfigurer" target="org.springframework.beans.factory.config.BeanFactoryPostProcessor">
      <point x="0.0" y="-14.5" />
      <point x="623.5" y="59.0" />
      <point x="536.875" y="59.0" />
      <point x="26.875" y="14.5" />
    </edge>
    <edge source="org.springframework.beans.factory.config.CustomEditorConfigurer" target="org.springframework.beans.factory.config.BeanFactoryPostProcessor">
      <point x="0.0" y="-14.5" />
      <point x="851.5" y="49.0" />
      <point x="590.625" y="49.0" />
      <point x="80.625" y="14.5" />
    </edge>
    <edge source="org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor" target="org.springframework.beans.factory.config.BeanFactoryPostProcessor">
      <point x="0.0" y="-14.5" />
      <point x="139.0" y="49.0" />
      <point x="429.375" y="49.0" />
      <point x="-80.625" y="14.5" />
    </edge>
    <edge source="org.springframework.context.weaving.AspectJWeavingEnabler" target="org.springframework.beans.factory.config.BeanFactoryPostProcessor">
      <point x="0.0" y="-14.5" />
      <point x="396.5" y="59.0" />
      <point x="483.125" y="59.0" />
      <point x="-26.875" y="14.5" />
    </edge>
    <edge source="org.springframework.context.annotation.ConfigurationClassPostProcessor" target="org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor">
      <point x="0.0" y="-14.5" />
      <point x="0.0" y="14.5" />
    </edge>
  </edges>
  <settings layout="Hierarchic Group" zoom="1.0" x="475.5" y="93.5" />
  <SelectedNodes />
  <Categories />
  <SCOPE>All</SCOPE>
  <VISIBILITY>private</VISIBILITY>
</Diagram>


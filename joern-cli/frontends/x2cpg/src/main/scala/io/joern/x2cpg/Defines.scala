package io.joern.x2cpg

object Defines {
  // The following two defines should be used for type and method full names to
  // indicate unresolved static type information. Using them enables
  // the closed source backend to apply policies in a less strict fashion.
  // The most notable case is the METHOD_FULL_NAME property of a CALL node.
  // As example consider a call to a method `foo(someArg)` which cannot be
  // resolved. The METHOD_FULL_NAME should be given as
  // "<unresolvedNamespace>.foo:<unresolvedSignature>(1)". If the namespace is known
  // the METHOD_FULL_NAME should be given as
  // "some.namespace.foo:<unresolvedSignature>(1)". Thereby the number in parenthesis
  // is the number of call arguments.
  // Note that this schema and thus the defines only makes sense for statically
  // typed languages with a package/namespace structure like Java, CSharp, etc..
  val UnresolvedNamespace = "<unresolvedNamespace>"
  val UnresolvedSignature = "<unresolvedSignature>"

}
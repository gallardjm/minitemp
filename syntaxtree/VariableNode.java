package minimalistTemplateEngine.syntaxtree;

import minimalistTemplateEngine.Context;
import minimalistTemplateEngine.Token;

//for variable {{ x }}
public class VariableNode extends SyntaxTree {
  
  private Token token;
  
  public VariableNode(Token t) {
    token = t;
  }

  public String render(Context c) {    
    return c.getString(token.getContentClean());
  }
}

